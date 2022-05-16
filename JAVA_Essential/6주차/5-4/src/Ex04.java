class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int _x_, int _y_, String color){
		super(_x_, _y_);
		this.color = color;
	}
	void setPoint(int _x_, int _y_) {
		move(_x_, _y_);
	}
	void setColor(String _color_) {
		this.color = _color_;
	}
	void show() {
		System.out.println(color+"»öÀ¸·Î"+"("+getX() + "," + getY() + ")");
	}
}
public class Ex04 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setPoint(10, 20);
		cp.setColor("green");
		cp.show();

	}

}
