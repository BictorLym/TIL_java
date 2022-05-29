import java.awt.*;
public class ex05 {

	public static void main(String[] args) {
		//프레임 초기화
		Frame f = new Frame("GridLayout test");
		f.setSize(200, 200);
		f.setLayout(new GridLayout(3,2));
		//프레임에 버튼 추가
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		//프레임 출력
		f.setVisible(true);
	}

}
