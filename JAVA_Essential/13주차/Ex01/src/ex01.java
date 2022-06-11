import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class ex01 extends Frame{
	Label location;
	public ex01(String title) {
		super(title);
		//Frame f = new Frame("MouseEvent");
		//f.setSize(300, 200);
		location  = new Label("Mouse Pointer Location: ");
		location.setSize(195, 15);
		location.setLocation(5, 30);
		location.setBackground(Color.YELLOW);
		add(location);
		addMouseMotionListener(new EventH());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(300, 200);
		setLayout(null);
		setVisible(true);
//		class EventH2 implements MouseMotionListener{
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				location.setText("X = " + e.getX()+ "Y=" +e.getY());
//				
//			}
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex01 mainWin = new ex01("MouseEventTest");
		//mainWin.add(EventHandler());
	}
	class EventH implements MouseMotionListener{
		@Override
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location :" +"X = " + e.getX()+ "Y=" +e.getY());
		}
		@Override
		public void mouseDragged(MouseEvent e) {}
	}
	
}
