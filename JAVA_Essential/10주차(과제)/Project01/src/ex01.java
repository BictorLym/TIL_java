import java.util.*;

//����� ��ǥ�� ���õ� �⺻ Ŭ����
class Mypoint{
	Scanner sc = new Scanner(System.in);
	int x, y;
	//������
	Mypoint(){
		System.out.print("x ��ǥ = ");
		x = sc.nextInt();
		System.out.print("y ��ǥ = ");
		y = sc.nextInt();
	}
	//������2
	Mypoint(int _x, int _y){
		this.x = 0;
		this.y = 0;
	}
	//���
	public void disp() {
		System.out.println("��(x, y) = (" +x +", " + y+ ")" );
	}
}
//��ǥ�� ���õ� Mypoint Ŭ������ ��ӹ��� �� Ŭ����
class Circle extends Mypoint{
	int r;
	//������1
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ r = ");
		r = sc.nextInt();
	}
	//������2
	Circle(int _r){
		super(0, 0);
		this.r = 0;
	}
	//��ӹ��� Mypoint Ŭ������ disp�� ����ϰ�, circleŬ������ ������ ���
	public void disp() {
		super.disp();
		System.out.println("������ r = " + r);
	}
}
//��ǥ�� ���õ� Mypoint Ŭ������ ��ӹ��� �簢�� Ŭ����
class Rect extends Mypoint{
	int  w, h;
	//������1
	Rect(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�簢���� �� w = ");
		w = sc.nextInt();
		System.out.print("�簢���� ���� h = ");
		h = sc.nextInt();
	}
	//������2
	Rect(int _w, int _h){
		super(0, 0);
		this.w = 0;
		this.h = 0;
	}
	//��ӹ��� Mypoint Ŭ������ disp�� ����ϰ�, rectŬ������ ������ ���
	public void disp() {
		super.disp();
		System.out.println("�� = " + w + ", ���� = "+h);
	}
}

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//circle ��ü�� ������ �ؽ���
		HashMap<Integer, Circle> circleHash = new HashMap<Integer, Circle>();
		//rect ��ü�� ������ �ؽ���
		HashMap<Integer, Rect> rectHash = new HashMap<Integer, Rect>();
		
		int idx = 0;
		while(true) {
			System.out.print("1.�� 2.�簢�� 3.���� 4.���� :");
			int user_input = sc.nextInt();
			//1.��	�� �Է¹޾��� ��
			if(user_input==1) {
				Circle tmp = new Circle();
				circleHash.put(idx, tmp);
				idx++;
			}
			//2.�簢��	�� �Է¹޾��� ��
			else if(user_input==2) {
				Rect tmp = new Rect();
				rectHash.put(idx, tmp);
				idx++;
			}
			//3.����		�� �Է¹޾��� ��
			else if(user_input==3) {
				System.out.println();
				System.out.println("  ------- ���� -------  ");
				for(int i = 0; i < idx; i++) {
					if(circleHash.containsKey(i)) {
						//������1�� �Է��� �����Ƿ� ������2�� ���
						Circle tmp = new Circle(0);
						tmp = circleHash.get(i);
						tmp.disp();
						System.out.println();
					}
					else if(rectHash.containsKey(i)) {
						//������1�� �Է��� �����Ƿ� ������2�� ���
						Rect tmp = new Rect(0, 0);
						tmp = rectHash.get(i);
						tmp.disp();
						System.out.println();
					}
				}
			}
			//4.����
			else if(user_input==4) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(1);
			}
		}
	}
}

