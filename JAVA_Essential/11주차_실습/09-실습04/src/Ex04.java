import java.awt.*;
public class Ex04 {
	public static void main(String args[]) {
		//������ ����
		Frame f = new Frame("Questions");
		//������ ����
		f.setSize(305, 250);
		f.setLayout(new FlowLayout());		
		//�� ����
		Label q1 = new Label("1. ����� ���ɺоߴ�?(������ ���ð���)");
		//üũ�ڽ� 1~4 ����
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports", true);
		Checkbox movies = new Checkbox("movies", true);
		Checkbox music = new Checkbox("music", true);
		
		//�󺧰� üũ�ڽ� �����ӿ� �߰�
		f.add(q1); f.add(news);	f.add(sports);	f.add(movies);	f.add(music);
		
		//�� ����
		Label q2 = new Label("�󸶳� ���� ���忡 ���ʴϱ�?");
		//üũ�ڽ� ���� 1~4
		Checkbox movie1 = new Checkbox("�Ѵ޿� �ѹ�", true);
		Checkbox movie2 = new Checkbox("�����Ͽ� �ѹ�", true);
		Checkbox movie3 = new Checkbox("�����Ͽ� �ι�", true);
		
		
		//�󺧰� üũ�ڽ� �����ӿ� �߰�
		f.add(q2); f.add(movie1); f.add(movie2); f.add(movie3);
		//������ ���
		f.setVisible(true);
	}
}
//public class Ex04 {
//	public static void main(String args[]) {
//		//������ ����
//		Frame f = new Frame("Questions");
//		//������ ����
//		f.setSize(305, 250);
//		f.setLayout(new FlowLayout());
//		
//		//�� ����
//		Label q1 = new Label("1. ����� ���� �оߴ�?(������ ���ð���)");
//		//üũ�ڽ� 1~4 ����
//		Checkbox news = new Checkbox("news", true);
//		Checkbox sports = new Checkbox("sports");
//		Checkbox movies = new Checkbox("movies");
//		Checkbox music = new Checkbox("music");
//		
//		//�󺧰� üũ�ڽ� �����ӿ� �߰�
//		f.add(q1);f.add(news);f.add(sports);f.add(movies);f.add(music);
//		
//		//�� ����
//		Label q2 = new Label("2. �󸶳� ���� ���忡 ���ʴϱ�?");
//		//üũ�ڽ� ���� 1~4
//		CheckboxGroup group1 = new CheckboxGroup();
//		Checkbox movie1 = new Checkbox("�� �޿� �� �� ���ϴ�.", true);
//		Checkbox movie2 = new Checkbox("�����Ͽ� �� �� ���ϴ�.");
//		Checkbox movie3 = new Checkbox("�����Ͽ� �� �� ���ϴ�.");
//		
//		//�󺧰� üũ�ڽ� �����ӿ� �߰�
//		f.add(q2);f.add(movie1);f.add(movie2);f.add(movie3);
//		//������ ���
//		f.setVisible(true);
//	}
//}
