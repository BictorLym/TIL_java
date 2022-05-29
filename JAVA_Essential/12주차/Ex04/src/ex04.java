import java.awt.*;
public class ex04 {

	public static void main(String[] args) {
		//프레임 초기화
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(200, 200);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//버튼 추가
		f.add(new Button("첫 번째"));
		f.add(new Button("두 번째"));
		f.add(new Button("세 번째"));
		f.add(new Button("넷 번째"));
		f.add(new Button("다섯 번째"));
		//프레임 출력
		f.setVisible(true);
	}

}
