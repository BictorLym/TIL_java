import java.awt.*;

public class Ex04 {
	public static void main(String args[]) {
		Frame f = new Frame("Questions");
		f.setSize(305, 250);
		
		f.setLayout(new FlowLayout());
		
		Label q1 = new Label("1. ����� ���� �оߴ�?(������ ���ð���)");
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music");
		
		f.add(q1);f.add(news);f.add(sports);f.add(movies);f.add(music);
		
		Label q2 = new Label("2. �󸶳� ���� ���忡 ���ʴϱ�?");
		CheckboxGroup group1 = new CheckboxGroup();
		Checkbox movie1 = new Checkbox("�� �޿� �� �� ���ϴ�.", true);
		Checkbox movie2 = new Checkbox("�����Ͽ� �� �� ���ϴ�.");
		Checkbox movie3 = new Checkbox("�����Ͽ� �� �� ���ϴ�.");
		
		f.add(q2);f.add(movie1);f.add(movie2);f.add(movie3);
		f.setVisible(true);
	}
}
