import java.util.Scanner;
class Mypoint{
	Scanner sc = new Scanner(System.in);
	int x, y;
	Mypoint(){
		System.out.print("x ��ǥ = ");
		x = sc.nextInt();
		System.out.print("y ��ǥ = ");
		y = sc.nextInt();
	}
	public void disp() {
		System.out.println("��(x, y) = (" +x +", " + y+ ")" );
	}
}
class Circle02 extends Mypoint{
	int r;
	Circle02(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ r = ");
		r = sc.nextInt();
	}
	public void disp() {
		//System.out.println("��(x, y) = (" +x +", " + y+ ")" );
		super.disp();
		System.out.println("������ r = " + r);
	}
	
	
	
}
class Rect02 extends Mypoint{
	int  w, h;
	Rect02(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�簢���� �� w = ");
		w = sc.nextInt();
		System.out.print("�簢���� ���� w = ");
		h = sc.nextInt();
	}
	public void disp() {
		//System.out.println("��(x, y) = (" +x +", " + y+ ")" );
		super.disp();
		System.out.println("�� = " + w + ", ���� = "+h);
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
