import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;

public class Ex03 {
	public static void main(String args[]) {
		//������ ����
		Frame f = new Frame("Login");
		//������ ����
		f.setSize(300, 200);
		f.setLayout(null);		
		//���� ����
		Choice day = new Choice();
		//���� �߰�
		day.add("������");
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		day.add("�Ͽ���");
		//���� ����
		day.setSize(100, 50);
		day.setLocation(100, 70);		
		//���� �����ӿ� �߰�
		f.add(day);
		//������ ���
		f.setVisible(true);
	}
}

//public class Ex03 {
//	public static void main(String args[]) {
//		//������ ����
//		Frame f = new Frame("Login");
//		//������ ����
//		f.setSize(300, 200);
//		f.setLayout(null);
//		
//		//���� ����
//		Choice day = new Choice();
//		//���� �߰�
//		day.add("SUN");
//		day.add("MON");
//		day.add("TUE");
//		day.add("WED");
//		day.add("THU");
//		day.add("FRI");
//		day.add("SAT");
//		//���� ����
//		day.setSize(100, 50);
//		day.setLocation(100, 70);
//		
//		//���� �����ӿ� �߰�
//		f.add(day);
//		//������ ���
//		f.setVisible(true);
//	}
//}
