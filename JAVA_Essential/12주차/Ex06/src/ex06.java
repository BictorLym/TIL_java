import java.awt.*;
import java.awt.event.*;
public class ex06 {

	public static void main(String[] args) {
		//프레임 생성 및 세팅
		final Frame f = new Frame ("CardLayoutTest");
		final CardLayout card = new CardLayout(10,10);
		f.setLayout(card);
		f.setSize(200, 200);
		f.setLocation(200, 200);
		
		//판넬 생성
		Panel card1 = new Panel();
		card1.setBackground(Color.lightGray);
		card1.add(new Label("Card1"));
		Panel card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("Card2"));
		Panel card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("Card3"));
		//프레임에 판넬 추가
		f.add(card1, "1"); f.add(card2, "2"); f.add(card3, "3");
		//핸들러 클래스
		class Handler extends MouseAdapter{
			public void mouseClicked(MouseEvent e) {
				if(e.getModifiers() == e.BUTTON3_MASK) {
					card.previous(f);;
				}
				else {
					card.next(f);
				}
			}
		}
		//카드에 마우스 핸들러
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());
		
		//프레임출력
		f.setVisible(true);
		
		card.show(f, "1");
	}

}
