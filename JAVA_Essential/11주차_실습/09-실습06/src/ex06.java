import java.awt.*;

public class ex06 {

	public static void main(String[] args) {
		//������ ����
		Frame f = new Frame("Parent");
		//������ ����
		f.setSize(300,200);
		
		//�پ�α� ����
		Dialog info = new Dialog(f, "Infomation", true);
		//�پ�α� ����
		info.setSize(140, 90);
		info.setLocation(50,50);
		info.setLayout(new FlowLayout());
		
		//�޼��� ����
		Label msg = new Label("This is Modal Dialog", Label.CENTER);
		//��ư ����
		Button ok = new Button("OK");
		//�پ�α׿� �޼����� ��ư �߰� 
		info.add(msg); info.add(ok);
		
		//������ ���
		f.setVisible(true);
		//�پ�α� ���
		info.setVisible(true);

	}

}

//public class ex06 {
//
//	public static void main(String[] args) {
//		//������ ����
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