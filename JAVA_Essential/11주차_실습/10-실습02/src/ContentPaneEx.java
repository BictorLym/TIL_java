import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame{
	//프레임을 상속받은 프레임 클래스
	public ContentPaneEx(){
		//프레임 설정
		setTitle("ContentFrame과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//컨테이너 생성
		Container contentPane = getContentPane();
		//컨테이너 설정
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		//프레임에 버튼 추가
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("ignore"));
		//프레임 사이즈 설정
		setSize(300,150);
		//프레임 출력
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
