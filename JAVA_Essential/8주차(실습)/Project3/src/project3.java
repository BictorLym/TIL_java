import java.util.Scanner;
class Mypoint03{
	Scanner sc = new Scanner(System.in);
	int x, y;
	Mypoint03(){
		System.out.print("x ��ǥ = ");
		x = sc.nextInt();
		System.out.print("y ��ǥ = ");
		y = sc.nextInt();
	}
	public void disp() {
		System.out.println("��(x, y) = (" +x +", " + y+ ")" );
	}
}

class Circle03 extends Mypoint03{
	int r;
	Circle03(){
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
class Rect03 extends Mypoint03{
	int  w, h;
	Rect03(){
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
public class project3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		
		Circle03[] circleArray = new Circle03[10];
		int i=0;
		
		Rect03[] rectArray = new Rect03[10];
		int j=0;
		
		do {
			System.out.print("1.�� 2.�簢�� 3.���� 4.���� :");
			int user_input = sc.nextInt();
			//1.��
			if(user_input==1) {
				circleArray[i] = new Circle03();
				i++;
				n--;
			}
			//2.�簢��
			else if(user_input==2) {
				rectArray[j] = new Rect03();
				j++;
				n--;
			}
			//3.����
			else if(user_input==3) {
				int idx = i;
				if(idx==0) {
					System.out.println("���� �����ϴ�.");
				}
				else {
					for(int k = 0; k <idx; k++) {
						circleArray[k].disp();
					}
				}
				System.out.println();
				System.out.println();
				idx = j;
				if(idx==0) {
					System.out.println("�簢���� �����ϴ�.");
				}
				else {
					for(int k = 0; k < idx; k++) {
						rectArray[k].disp();
					}
				}
			}

			//4.����
			else if(user_input==4) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(1);
			}
		}while(n>0);

	}

}

