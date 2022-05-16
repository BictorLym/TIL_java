import java.awt.*;

public class Ex04 {
	public static void main(String args[]) {
		Frame f = new Frame("Questions");
		f.setSize(305, 250);
		
		f.setLayout(new FlowLayout());
		
		Label q1 = new Label("1. 당신의 관심 분야는?(여러개 선택가능)");
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music");
		
		f.add(q1);f.add(news);f.add(sports);f.add(movies);f.add(music);
		
		Label q2 = new Label("2. 얼마나 자주 극장에 가십니까?");
		CheckboxGroup group1 = new CheckboxGroup();
		Checkbox movie1 = new Checkbox("한 달에 한 번 갑니다.", true);
		Checkbox movie2 = new Checkbox("일주일에 한 번 갑니다.");
		Checkbox movie3 = new Checkbox("일주일에 두 번 갑니다.");
		
		f.add(q2);f.add(movie1);f.add(movie2);f.add(movie3);
		f.setVisible(true);
	}
}
