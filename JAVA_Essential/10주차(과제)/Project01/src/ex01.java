import java.util.*;

//상속할 좌표와 관련된 기본 클래스
class Mypoint{
	Scanner sc = new Scanner(System.in);
	int x, y;
	//생성자
	Mypoint(){
		System.out.print("x 좌표 = ");
		x = sc.nextInt();
		System.out.print("y 좌표 = ");
		y = sc.nextInt();
	}
	//생성자2
	Mypoint(int _x, int _y){
		this.x = 0;
		this.y = 0;
	}
	//출력
	public void disp() {
		System.out.println("점(x, y) = (" +x +", " + y+ ")" );
	}
}
//좌표와 관련된 Mypoint 클래스를 상속받은 원 클래스
class Circle extends Mypoint{
	int r;
	//생성자1
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 r = ");
		r = sc.nextInt();
	}
	//생성자2
	Circle(int _r){
		super(0, 0);
		this.r = 0;
	}
	//상속받은 Mypoint 클래스의 disp를 출력하고, circle클래스의 내용을 출력
	public void disp() {
		super.disp();
		System.out.println("반지름 r = " + r);
	}
}
//좌표와 관련된 Mypoint 클래스를 상속받은 사각형 클래스
class Rect extends Mypoint{
	int  w, h;
	//생성자1
	Rect(){
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 폭 w = ");
		w = sc.nextInt();
		System.out.print("사각형의 높이 h = ");
		h = sc.nextInt();
	}
	//생성자2
	Rect(int _w, int _h){
		super(0, 0);
		this.w = 0;
		this.h = 0;
	}
	//상속받은 Mypoint 클래스의 disp를 출력하고, rect클래스의 내용을 출력
	public void disp() {
		super.disp();
		System.out.println("폭 = " + w + ", 높이 = "+h);
	}
}

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//circle 객체를 저장할 해쉬맵
		HashMap<Integer, Circle> circleHash = new HashMap<Integer, Circle>();
		//rect 객체를 저장할 해쉬맵
		HashMap<Integer, Rect> rectHash = new HashMap<Integer, Rect>();
		
		int idx = 0;
		while(true) {
			System.out.print("1.원 2.사각형 3.보기 4.종료 :");
			int user_input = sc.nextInt();
			//1.원	을 입력받았을 때
			if(user_input==1) {
				Circle tmp = new Circle();
				circleHash.put(idx, tmp);
				idx++;
			}
			//2.사각형	을 입력받았을 때
			else if(user_input==2) {
				Rect tmp = new Rect();
				rectHash.put(idx, tmp);
				idx++;
			}
			//3.보기		를 입력받았을 때
			else if(user_input==3) {
				System.out.println();
				System.out.println("  ------- 보기 -------  ");
				for(int i = 0; i < idx; i++) {
					if(circleHash.containsKey(i)) {
						//생성자1은 입력을 받으므로 생성자2를 사용
						Circle tmp = new Circle(0);
						tmp = circleHash.get(i);
						tmp.disp();
						System.out.println();
					}
					else if(rectHash.containsKey(i)) {
						//생성자1은 입력을 받으므로 생성자2를 사용
						Rect tmp = new Rect(0, 0);
						tmp = rectHash.get(i);
						tmp.disp();
						System.out.println();
					}
				}
			}
			//4.종료
			else if(user_input==4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
			}
		}
	}
}

