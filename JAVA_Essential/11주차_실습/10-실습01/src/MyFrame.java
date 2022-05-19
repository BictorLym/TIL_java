import javax.swing.*;
public class MyFrame extends JFrame {
	//프레임 클래스 성성
	public MyFrame() {
		//프레임 설정
		setTitle("300x300 스윙프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		//프레임 출력
		MyFrame frame = new MyFrame();
	}

}
