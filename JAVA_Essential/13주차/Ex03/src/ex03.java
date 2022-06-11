import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class ex03 extends Frame{
	Label Q1, Q2;
	Checkbox chk1_1, chk1_2, chk1_3, chk1_4;
	Checkbox chk2_1, chk2_2, chk2_3, chk2_4;
	Button end;
	Label score;
	public ex03(String title) {
		super(title);
		//Frame f = new Frame("MouseEvent");
		//f.setSize(300, 200);
		setSize(800, 500);
		setLayout(new GridLayout(13, 1, 0, 10));
//		setLayout(new GridLayout(5,1,1,1));
//		setLayout(new GridLayout());
		
		Q1 = new Label("1. ���� �� ActionEvent�� action�޼��尡 ȣ��Ǵ� ����?(��� ������.)");
		
		CheckboxGroup group1 = new CheckboxGroup();
		chk1_1 = new Checkbox("Button�� ������ ��");
		chk1_2 = new Checkbox("TextField���� EnterŰ�� ������ ��");
		chk1_3 = new Checkbox("Meanuitem�� Ŭ������ ��");
		chk1_4 = new Checkbox("List���� ���� Ŭ������ item�� �������� ��");
		add(Q1);	add(chk1_1);	add(chk1_2); add(chk1_3);	add(chk1_4);
		
		Q2 = new Label("2. Frame�� �⺻ LayoutManager��?(�ϳ��� ������.)");
		CheckboxGroup group2 = new CheckboxGroup();
		chk2_1 = new Checkbox("FlowLayout");
		chk2_2 = new Checkbox("GridLayout");
		chk2_3 = new Checkbox("BorderLayout");
		chk2_4 = new Checkbox("CardLayout");
		add(Q2);	add(chk2_1);	add(chk2_2);	add(chk2_3);	add(chk2_4);

		score = new Label("���: ");
		end = new Button("�� ��ư�� �����ø� ����� �� �� �ֽ��ϴ�.");
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float totalScore = 0;
				if(chk1_1.getState())	totalScore += 12.5;
				if(chk1_2.getState())	totalScore += 12.5;
				if(chk1_3.getState())	totalScore += 12.5;
				if(chk1_4.getState())	totalScore += 12.5;
				if(chk2_3.getState())	totalScore += 50;
				score.setText("��� : ����� ������" + totalScore + "�� �Դϴ�.");
			}
		});
		add(score);add(end);
		setVisible(true);

	}
	public static void main(String[] args) {
		ex03 mainWin = new ex03("CheckboxEventTest-Quiz");
	}

}
