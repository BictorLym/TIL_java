import java.awt.*;

public class ButtonTest2 {

	public static void main(String[] args) {
		//프레임 생성
		Frame f = new Frame("Login");
		//프레임 설정(크기와 레이아웃)
		f.setSize(300, 200);
		f.setLayout(null);
		
		//버튼설정(크기와 위치)
		Button b = new Button("확 인");
		b.setSize(100,50);
		b.setLocation(100, 75);
		//버튼을 프레임에 추가
		f.add(b);
		//프레임 출력
		f.setVisible(true);
	}

}
//public class ButtonTest2 {
//
//	public static void main(String[] args) {
//		//프레임 생성
//		Frame f = new Frame("Login");
//		//프레임 설정(크기와 레이아웃)
//		f.setSize(300, 200);
//		f.setLayout(null);
//		
//		//버튼설정(크기와 위치)
//		Button b = new Button("확 인");
//		b.setSize(100, 50);
//		b.setLocation(100, 75);
//		
//		//버튼을 프레임에 추가
//		f.add(b);
//		//프레임 출력
//		f.setVisible(true);
//	}
//
//}

