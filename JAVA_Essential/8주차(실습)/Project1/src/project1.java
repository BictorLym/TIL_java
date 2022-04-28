import java.util.*;
class Circle{
	int x, y, r;
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 x 좌표 = ");
		x = sc.nextInt();
		System.out.print("원의 y 좌표 = ");
		y = sc.nextInt();
		System.out.print("반지름 r = ");
		r = sc.nextInt();
	}
	void disp() {
		System.out.println("점(x, y) = (" +x +", " + y+ ")" );
		System.out.println("반즈림 r = " + r);
	}
	
	
	
}
class Rect{
	int x, y , w, h;
	Rect(){
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 x 좌표 = ");
		x = sc.nextInt();
		System.out.print("사각형의 y 좌표 = ");
		y = sc.nextInt();
		System.out.print("사각형의 폭 w = ");
		w = sc.nextInt();
		System.out.print("사각형의 높이 w = ");
		h = sc.nextInt();
	}
	void disp() {
		System.out.println("점(x, y) = (" +x +", " + y+ ")" );
		System.out.println("폭 = " + w + ", 높이 = "+h);
	}
}
public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cc = new Circle();
		cc.disp();
		System.out.println();
		
		Rect rt = new Rect();
		rt.disp();
	}

}
