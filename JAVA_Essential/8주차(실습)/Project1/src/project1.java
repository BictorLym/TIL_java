import java.util.*;
class Circle{
	int x, y, r;
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("���� x ��ǥ = ");
		x = sc.nextInt();
		System.out.print("���� y ��ǥ = ");
		y = sc.nextInt();
		System.out.print("������ r = ");
		r = sc.nextInt();
	}
	void disp() {
		System.out.println("��(x, y) = (" +x +", " + y+ ")" );
		System.out.println("��� r = " + r);
	}
	
	
	
}
class Rect{
	int x, y , w, h;
	Rect(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�簢���� x ��ǥ = ");
		x = sc.nextInt();
		System.out.print("�簢���� y ��ǥ = ");
		y = sc.nextInt();
		System.out.print("�簢���� �� w = ");
		w = sc.nextInt();
		System.out.print("�簢���� ���� w = ");
		h = sc.nextInt();
	}
	void disp() {
		System.out.println("��(x, y) = (" +x +", " + y+ ")" );
		System.out.println("�� = " + w + ", ���� = "+h);
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
