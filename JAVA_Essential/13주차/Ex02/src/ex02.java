import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class ex02 extends Frame{
	Label location;
	Label lid, lpwd;
	TextField tfid,  tfpwd;
	Button b1;
	public ex02(String title) {
		super(title);
		//Frame f = new Frame("MouseEvent");
		//f.setSize(300, 200);
		setSize(480, 80);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lid = new Label("ID: ", Label.RIGHT);
		lpwd = new Label("Password:");
		
		tfid = new TextField(10);
		tfpwd = new TextField(10);
		
		b1 = new Button("Ȯ��");
		
		tfid.addActionListener(new EventHandler());
		tfpwd.addActionListener(new EventHandler());
		b1.addActionListener(new EventHandler());
		
		add(lid);
		add(tfid);
		add(lpwd);
		add(tfpwd);
		add(b1);
		
		setVisible(true);

	}
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String id = tfid.getText();
			String password = tfpwd.getText();
			if(!id.equals("javachobo")) {
				System.out.println("�Է��Ͻ� id�� ��ȿ���� �ʽ��ϴ�.");
				tfid.requestFocus();
				tfid.selectAll();
			}
			else if(!password.equals("asdf")) {
				System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				tfpwd.requestFocus();
				tfpwd.selectAll();
			}
			else {
				System.out.println(id+"��, ���������� �α��� �Ǿ����ϴ�.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02 mainWin = new ex02("Login");
	}
	
}
