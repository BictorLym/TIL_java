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
		
		b1 = new Button("확인");
		
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
				System.out.println("입력하신 id가 유효하지 않습니다.");
				tfid.requestFocus();
				tfid.selectAll();
			}
			else if(!password.equals("asdf")) {
				System.out.println("입력하신 비밀번호가 틀렸습니다.");
				tfpwd.requestFocus();
				tfpwd.selectAll();
			}
			else {
				System.out.println(id+"님, 성공적으로 로그인 되었습니다.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02 mainWin = new ex02("Login");
	}
	
}
