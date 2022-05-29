import java.awt.*;

public class ex06 {

	public static void main(String[] args) {
		//프레임 생성
		Frame f = new Frame("Parent");
		//프레임 설정
		f.setSize(300,200);
		
		//다얄로그 생성
		Dialog info = new Dialog(f, "Infomation", true);
		//다얄로그 설정
		info.setSize(140, 90);
		info.setLocation(50,50);
		info.setLayout(new FlowLayout());
		
		//메세지 생성
		Label msg = new Label("This is Modal Dialog", Label.CENTER);
		//버튼 생성
		Button ok = new Button("OK");
		//다얄로그에 메세지와 버튼 추가 
		info.add(msg); info.add(ok);
		
		//프레임 출력
		f.setVisible(true);
		//다얄로그 출력
		info.setVisible(true);

	}

}

//public class ex06 {
//
//	public static void main(String[] args) {
//		//프레임 생성
//		Frame f = new Frame("Parent");
//		f.setSize(300, 200);
//		
//		Dialog info = new Dialog(f, "Information", true);
//		info.setSize(140, 90);
//		info.setLocation(50, 50);
//		info.setLayout(new FlowLayout());
//		
//		Label msg = new Label("This is Modal Dialog", Label.CENTER);
//		Button ok = new Button("ok");
//		info.add(msg); info.add(ok);
//		
//		f.setVisible(true);
//		info.setVisible(true);
//	}
//
//}