import java.util.Scanner;
class Mypoint{
	Scanner sc = new Scanner(System.in);
	int x, y;
	Mypoint(){
		System.out.print("x 좌표 = ");
		x = sc.nextInt();
		System.out.print("y 좌표 = ");
		y = sc.nextInt();
	}
	public void disp() {
		System.out.println("점(x, y) = (" +x +", " + y+ ")" );
	}
}
class Circle02 extends Mypoint{
	int r;
	Circle02(){
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 r = ");
		r = sc.nextInt();
	}
	public void disp() {
		//System.out.println("점(x, y) = (" +x +", " + y+ ")" );
		super.disp();
		System.out.println("반지름 r = " + r);
	}
	
	
	
}
class Rect02 extends Mypoint{
	int  w, h;
	Rect02(){
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 폭 w = ");
		w = sc.nextInt();
		System.out.print("사각형의 높이 w = ");
		h = sc.nextInt();
	}
	public void disp() {
		//System.out.println("점(x, y) = (" +x +", " + y+ ")" );
		super.disp();
		System.out.println("폭 = " + w + ", 높이 = "+h);
	}
}
public class project2 {

	public static void main(String[] args){
		Circle02 cc = new Circle02();
		cc.disp();
		System.out.println();
		System.out.println();
		Rect02 rt = new Rect02();
		rt.disp();

	}

}
