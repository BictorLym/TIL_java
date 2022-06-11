import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class rep03 extends JFrame{
	String title;
//	ArrayList<Container> contentPane = new ArrayList<Container>();
//	Container contentPane = getContentPane();
	Panel slide;
	Panel card1, card2, card3, card4, card5;
	CardLayout card;

	Panel buttons;
	JButton back2, back1, forward1, forward2;
//	ArrayList<JButton> Button = new ArrayList<JButton>(5);
//	JLabel label1, label2, label3, label4, label5;
	//Panel, CardLayout, Button, Label 
	public rep03(String _title_){
		super(_title_);
		int n = 5;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new CardLayout());
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);
		
		buttons = new Panel();
		back2 = new JButton("<<");
		back1 = new JButton("<");
		forward1 = new JButton(">");
		forward2 = new JButton(">>");
		buttons.add(back2);buttons.add(back1);buttons.add(forward1);buttons.add(forward2);

		back2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                card.first(slide);
            }
        });

        

        back1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                card.previous(slide);
            }
        });

        forward1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
            	card.next(slide);
            }

        });

        forward2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                card.last(slide);
            }

        });
		card1 = new Panel();card1.setBackground(Color.gray);card1.add(new Label("첫번째 페이지입니다."));
		card2 = new Panel();card2.setBackground(Color.orange);card2.add(new Label("두번째 페이지입니다."));
		card3 = new Panel();card3.setBackground(Color.blue);card3.add(new Label("세번째 페이지입니다."));
		card4 = new Panel();card4.setBackground(Color.CYAN);card4.add(new Label("네번째 페이지입니다."));
		card5 = new Panel();card5.setBackground(Color.pink);card5.add(new Label("다섯번째 페이지입니다."));
		slide.add(card1,"1");slide.add(card2,"2");slide.add(card3,"3");slide.add(card4,"4");slide.add(card5,"5");
		add("Center", slide);
		add("South",buttons);
		
		setSize(300, 200);
		setVisible(true);
		
		card.show(slide,"1");
	}
	
	public static void main(String[] args) {
		rep03 main = new rep03("Report03");
	}

}
