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
		
		Q1 = new Label("1. 다음 중 ActionEvent의 action메서드가 호출되는 경우는?(모두 고르세요.)");
		
		CheckboxGroup group1 = new CheckboxGroup();
		chk1_1 = new Checkbox("Button을 눌렀을 때");
		chk1_2 = new Checkbox("TextField에서 Enter키를 눌렀을 때");
		chk1_3 = new Checkbox("Meanuitem을 클릭했을 때");
		chk1_4 = new Checkbox("List에서 더블 클릭으로 item을 선택했을 때");
		add(Q1);	add(chk1_1);	add(chk1_2); add(chk1_3);	add(chk1_4);
		
		Q2 = new Label("2. Frame의 기본 LayoutManager는?(하나만 고르세요.)");
		CheckboxGroup group2 = new CheckboxGroup();
		chk2_1 = new Checkbox("FlowLayout");
		chk2_2 = new Checkbox("GridLayout");
		chk2_3 = new Checkbox("BorderLayout");
		chk2_4 = new Checkbox("CardLayout");
		add(Q2);	add(chk2_1);	add(chk2_2);	add(chk2_3);	add(chk2_4);

		score = new Label("결과: ");
		end = new Button("이 버튼을 누르시면 결과를 알 수 있습니다.");
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float totalScore = 0;
				if(chk1_1.getState())	totalScore += 12.5;
				if(chk1_2.getState())	totalScore += 12.5;
				if(chk1_3.getState())	totalScore += 12.5;
				if(chk1_4.getState())	totalScore += 12.5;
				if(chk2_3.getState())	totalScore += 50;
				score.setText("결과 : 당신의 점수는" + totalScore + "점 입니다.");
			}
		});
		add(score);add(end);
		setVisible(true);

	}
	public static void main(String[] args) {
		ex03 mainWin = new ex03("CheckboxEventTest-Quiz");
	}

}
