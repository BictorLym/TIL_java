import java.util.Scanner;
class Mypoint03{
	Scanner sc = new Scanner(System.in);
	int x, y;
	Mypoint03(){
		System.out.print("x 좌표 = ");
		x = sc.nextInt();
		System.out.print("y 좌표 = ");
		y = sc.nextInt();
	}
	public void disp() {
		System.out.println("점(x, y) = (" +x +", " + y+ ")" );
	}
}

class Circle03 extends Mypoint03{
	int r;
	Circle03(){
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
class Rect03 extends Mypoint03{
	int  w, h;
	Rect03(){
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
public class project3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		
		Circle03[] circleArray = new Circle03[10];
		int i=0;
		
		Rect03[] rectArray = new Rect03[10];
		int j=0;
		
		do {
			System.out.print("1.원 2.사각형 3.보기 4.종료 :");
			int user_input = sc.nextInt();
			//1.원
			if(user_input==1) {
				circleArray[i] = new Circle03();
				i++;
				n--;
			}
			//2.사각형
			else if(user_input==2) {
				rectArray[j] = new Rect03();
				j++;
				n--;
			}
			//3.보기
			else if(user_input==3) {
				int idx = i;
				if(idx==0) {
					System.out.println("원이 없습니다.");
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
					System.out.println("사각형이 없습니다.");
				}
				else {
					for(int k = 0; k < idx; k++) {
						rectArray[k].disp();
					}
				}
			}

			//4.종료
			else if(user_input==4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
			}
		}while(n>0);

	}

}

