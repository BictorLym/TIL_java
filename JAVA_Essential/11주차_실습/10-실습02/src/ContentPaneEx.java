import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame{
	//�������� ��ӹ��� ������ Ŭ����
	public ContentPaneEx(){
		//������ ����
		setTitle("ContentFrame�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����̳� ����
		Container contentPane = getContentPane();
		//�����̳� ����
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		//�����ӿ� ��ư �߰�
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("ignore"));
		//������ ������ ����
		setSize(300,150);
		//������ ���
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
