import java.awt.*;
public class ex04 {

	public static void main(String[] args) {
		//������ �ʱ�ȭ
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(200, 200);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//��ư �߰�
		f.add(new Button("ù ��°"));
		f.add(new Button("�� ��°"));
		f.add(new Button("�� ��°"));
		f.add(new Button("�� ��°"));
		f.add(new Button("�ټ� ��°"));
		//������ ���
		f.setVisible(true);
	}

}
