import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class B_test extends Frame {
	
	Button b = new Button("확 인");
	
	B_test(String title) {
		super(title);
		setLayout(null);
		b.setBounds(100, 75, 100, 50);
		b.addActionListener(new EventHandler());
		
		//이벤트 핸들러를 버튼의 이벤트 리스너를 등록한다.
		//b.addActionListener(new EventHandler());
		
		add(b);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		B_test mainWin = new B_test("Event Test");
	}

}
class EventHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("버튼이 눌러졌습니다.");
	}
}

	