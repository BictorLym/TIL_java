import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rep02 extends JFrame {
	private JTextArea ta = new JTextArea(7,20);
	private JTextField tf = new JTextField(20);
	
	String title;
	
	public rep02(String title){
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		//c.add(new JLabel())
		ta.setEditable(false);

		add(new JScrollPane(ta), "Center");
		add(tf, "South");
		tf.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");
			}
		});
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		rep02 main = new rep02("Report02");

	}

}
