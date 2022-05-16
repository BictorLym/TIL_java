interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- �ٽ� �׸��ϴ�. ---");
		draw();
	}
}
class Circle implements Shape{
	int radius;
	Circle(int _r_){
		radius = _r_;
	}
//	void draw() {
//		System.out.print("������ " + radius);
//	}
//	double getArea() {
//		return PI * radius * radius;
//	}
	public void draw() {
		System.out.print("������ " + radius+ " ");
	}
	public double getArea() {
		return PI * radius * radius;
	}
}
public class ex_Bouns1 {

	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println("������ ������ " + coin.getArea());

	}

}
