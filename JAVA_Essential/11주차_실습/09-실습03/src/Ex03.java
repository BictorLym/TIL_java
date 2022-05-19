import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;

public class Ex03 {
	public static void main(String args[]) {
		//프레임 생성
		Frame f = new Frame("Login");
		//프레임 설정
		f.setSize(300, 200);
		f.setLayout(null);		
		//요일 생성
		Choice day = new Choice();
		//요일 추가
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		day.add("일요일");
		//요일 설정
		day.setSize(100, 50);
		day.setLocation(100, 70);		
		//요일 프레임에 추가
		f.add(day);
		//프레임 출력
		f.setVisible(true);
	}
}

//public class Ex03 {
//	public static void main(String args[]) {
//		//프레임 생성
//		Frame f = new Frame("Login");
//		//프레임 설정
//		f.setSize(300, 200);
//		f.setLayout(null);
//		
//		//요일 생성
//		Choice day = new Choice();
//		//요일 추가
//		day.add("SUN");
//		day.add("MON");
//		day.add("TUE");
//		day.add("WED");
//		day.add("THU");
//		day.add("FRI");
//		day.add("SAT");
//		//요일 설정
//		day.setSize(100, 50);
//		day.setLocation(100, 70);
//		
//		//요일 프레임에 추가
//		f.add(day);
//		//프레임 출력
//		f.setVisible(true);
//	}
//}
