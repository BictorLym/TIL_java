import java.awt.*;
public class Ex04 {
	public static void main(String args[]) {
		//프레임 생성
		Frame f = new Frame("Questions");
		//프레임 설정
		f.setSize(305, 250);
		f.setLayout(new FlowLayout());		
		//라벨 생성
		Label q1 = new Label("1. 당신의 관심분야는?(여러개 선택가능)");
		//체크박스 1~4 생성
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports", true);
		Checkbox movies = new Checkbox("movies", true);
		Checkbox music = new Checkbox("music", true);
		
		//라벨과 체크박스 프레임에 추가
		f.add(q1); f.add(news);	f.add(sports);	f.add(movies);	f.add(music);
		
		//라벨 생성
		Label q2 = new Label("얼마나 자주 극장에 가십니까?");
		//체크박스 생성 1~4
		Checkbox movie1 = new Checkbox("한달에 한번", true);
		Checkbox movie2 = new Checkbox("일주일에 한번", true);
		Checkbox movie3 = new Checkbox("일주일에 두번", true);
		
		
		//라벨과 체크박스 프레임에 추가
		f.add(q2); f.add(movie1); f.add(movie2); f.add(movie3);
		//프레임 출력
		f.setVisible(true);
	}
}
//public class Ex04 {
//	public static void main(String args[]) {
//		//프레임 생성
//		Frame f = new Frame("Questions");
//		//프레임 설정
//		f.setSize(305, 250);
//		f.setLayout(new FlowLayout());
//		
//		//라벨 생성
//		Label q1 = new Label("1. 당신의 관심 분야는?(여러개 선택가능)");
//		//체크박스 1~4 생성
//		Checkbox news = new Checkbox("news", true);
//		Checkbox sports = new Checkbox("sports");
//		Checkbox movies = new Checkbox("movies");
//		Checkbox music = new Checkbox("music");
//		
//		//라벨과 체크박스 프레임에 추가
//		f.add(q1);f.add(news);f.add(sports);f.add(movies);f.add(music);
//		
//		//라벨 생성
//		Label q2 = new Label("2. 얼마나 자주 극장에 가십니까?");
//		//체크박스 생성 1~4
//		CheckboxGroup group1 = new CheckboxGroup();
//		Checkbox movie1 = new Checkbox("한 달에 한 번 갑니다.", true);
//		Checkbox movie2 = new Checkbox("일주일에 한 번 갑니다.");
//		Checkbox movie3 = new Checkbox("일주일에 두 번 갑니다.");
//		
//		//라벨과 체크박스 프레임에 추가
//		f.add(q2);f.add(movie1);f.add(movie2);f.add(movie3);
//		//프레임 출력
//		f.setVisible(true);
//	}
//}
