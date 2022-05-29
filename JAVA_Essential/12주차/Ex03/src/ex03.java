import java.awt.*;
public class ex03 {

	public static void main(String[] args) {
		//프레임 초기화
		Frame f = new Frame("BorderLayoutTest");
		f.setSize(200, 200);
		f.setLayout(new BorderLayout());
		//버튼생성
		Button north = new Button("North");
		Button south = new Button("South");
		Button east = new Button("East");
		Button west = new Button("West");
		Button center = new Button("Center");
		//버튼 프레임에 추가
		f.add(north, "North");
		f.add(south, "South");
		f.add(east, "East");
		f.add(west, "West");
		f.add(center, "Center");
		
		f.setVisible(true);
	}

}
