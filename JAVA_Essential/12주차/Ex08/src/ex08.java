import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ex08 {

	public static void main(String[] args) {
		//������ ������ ����
		Frame f = new Frame("Login");
		f.setSize(200, 200);
		
		//������ ������ �߰�
		f.addWindowListener(new EventHandler());
		//������ ���
		f.setVisible(true);
	}

}
class EventHandler implements WindowListener{
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}