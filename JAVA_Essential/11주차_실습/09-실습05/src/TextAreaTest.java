import java.awt.*;
public class TextAreaTest {

	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(400, 220);
		f.setLayout(new FlowLayout());
		
		TextArea commnets = new TextArea("�ϰ� ���� ���� ��������.", 10, 50);
		
		f.add(commnets);
		commnets.selectAll();
		f.setVisible(true);

	}

}
