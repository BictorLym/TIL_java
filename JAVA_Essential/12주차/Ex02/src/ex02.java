import java.awt.*;
import java.awt.event.*;

public class ex02 {

	public static void main(String[] args) {
		final Frame f = new Frame("PopupMenu Test");
		f.setSize(300, 200);
		
		final PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				//������ ���콺��ư�� ������ PopupMenu�� ȭ�鿡 �����ش�.
				if(me.getButton()==MouseEvent.BUTTON3) {
					pMenu.show(f, me.getX(), me.getY());
				}
//				if(me.getModifiers()==me.BUTTON3_MASK) {
//					pMenu.show(f, me.getX(), me.getY());
//				}
			}
			
			
		});
		f.setVisible(true);
	}

}
