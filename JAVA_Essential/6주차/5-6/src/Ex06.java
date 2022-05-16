import java.util.*;
abstract class Shape{
	abstract void draw();
}
class Line extends Shape{
	void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle");
	}
}
//class Shape{
//	int n;
//	void draw() {
//		System.out.println("Shape");
//	}
//}
//class Line extends Shape{
//	void draw() {
//		System.out.println("Line");
//	}
//}
//class Rect extends Shape{
//	void draw() {
//		System.out.println("Rect");
//	}
//}
//class Circle extends Shape{
//	void draw() {
//		System.out.println("Circle");
//	}
//}
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String [] arr = new String[10];
		ArrayList<Shape> arr = new ArrayList<Shape>();
		//Vector<Shape> arr = new Vector<Shape>();
		int cnt = 0;
		while(true) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>");
			int input = sc.nextInt();
			
			if(input==1) {
				System.out.print("�������� Line(1), Rect(2), Circle(3)>>");
				int inputFigure = sc.nextInt();
				
				if(inputFigure==1){
					Line tmp = new Line();
					arr.add(tmp);
				}
				else if(inputFigure==2) {
					Rect tmp = new Rect();
					arr.add(tmp);
				}
				else if(inputFigure==3) {
					Circle tmp = new Circle();
					arr.add(tmp);
				}
				cnt++;
				
			}
			else if(input==2) {
				System.out.print("������ ������ ��ġ>>");
				int inputIndex = sc.nextInt();
				if(cnt < inputIndex) {
					System.out.println("������ �� �����ϴ�.");
				}
				else {
					arr.remove(inputIndex);
				}
			}
			else if(input==3) {
				for(int i = 0; i < arr.size(); i++) {
					arr.get(i).draw();
				}
			}
			else if(input==4) {
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(1);
			}
		}
	}
	
}


