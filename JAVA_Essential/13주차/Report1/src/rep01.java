import java.awt.Frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class rep01 extends JFrame {
	String title;
	ButtonGroup g;
	JRadioButton redBut, greenBut, blueBut;
	Container c;
	public rep01 (String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		//Container c = getContentPane();
		//c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));

		c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
//		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
		//라디오버튼 3개
		redBut = new JRadioButton("red");
		greenBut = new JRadioButton("green");
		blueBut = new JRadioButton("blue");
		
		redBut.addActionListener(new MyActionListener());
		greenBut.addActionListener(new MyActionListener());
		blueBut.addActionListener(new MyActionListener());
		
		
		c.add(redBut);	c.add(greenBut); c.add(blueBut);
//		c.setBackground(Color.red);
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rep01 mainWin = new rep01("Report01");
	}
	
	public class MyActionListener implements ActionListener{
		public void actionPerformed(final ActionEvent e) {
			JRadioButton b = (JRadioButton)e.getSource();
			if(b.getText().equals("red")) {
				c.setBackground(Color.red);
				redBut.setBackground(Color.RED);
				greenBut.setBackground(Color.RED);
				blueBut.setBackground(Color.RED);
				//System.out.println("red(debugging)");
			}
			if(b.getText().equals("green")) {
				c.setBackground(Color.green);
				redBut.setBackground(Color.green);
				greenBut.setBackground(Color.green);
				blueBut.setBackground(Color.green);
			}
			if(b.getText().equals("blue")) {
				c.setBackground(Color.blue);
				redBut.setBackground(Color.blue);
				greenBut.setBackground(Color.blue);
				blueBut.setBackground(Color.blue);
			}
		}
	}
}
