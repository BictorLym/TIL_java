import java.awt.*;
public class TextAreaTest {

	public static void main(String[] args) {
		//프레임 생성
		Frame f = new Frame("Comments");
		//프레임 설정
		f.setSize(500, 220);
		f.setLayout(new FlowLayout());
		
		//텍스트 공간 생성
		TextArea commnets = new TextArea("하고 싶은 말을 적으세요.", 100, 50);
		
		//텍스트공간 프레임에 추가
		f.add(commnets);
		commnets.selectAll();
		//프레임 출력
		f.setVisible(true);

	}

}
