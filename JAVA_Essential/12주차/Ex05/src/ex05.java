import java.awt.*;
public class ex05 {

	public static void main(String[] args) {
		//������ �ʱ�ȭ
		Frame f = new Frame("GridLayout test");
		f.setSize(200, 200);
		f.setLayout(new GridLayout(3,2));
		//�����ӿ� ��ư �߰�
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		//������ ���
		f.setVisible(true);
	}

}
