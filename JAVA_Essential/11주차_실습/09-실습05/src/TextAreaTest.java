import java.awt.*;
public class TextAreaTest {

	public static void main(String[] args) {
		//������ ����
		Frame f = new Frame("Comments");
		//������ ����
		f.setSize(500, 220);
		f.setLayout(new FlowLayout());
		
		//�ؽ�Ʈ ���� ����
		TextArea commnets = new TextArea("�ϰ� ���� ���� ��������.", 100, 50);
		
		//�ؽ�Ʈ���� �����ӿ� �߰�
		f.add(commnets);
		commnets.selectAll();
		//������ ���
		f.setVisible(true);

	}

}
