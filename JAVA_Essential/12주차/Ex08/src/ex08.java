import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ex08 {

	public static void main(String[] args) {
		//프레임 생성및 세팅
		Frame f = new Frame("Login");
		f.setSize(200, 200);
		
		//윈도우 리스너 추가
		f.addWindowListener(new EventHandler());
		//프레임 출력
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