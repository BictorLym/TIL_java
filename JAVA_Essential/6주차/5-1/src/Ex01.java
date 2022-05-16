import java.util.*;
class Circle{
	private int radius;
	public Circle() {}
	public Circle(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}

}
class NamedCircle extends Circle{
	private String name;
	public NamedCircle() {}
	public NamedCircle(int r, String _name_) {
		super(r);
		name = _name_;
	}
	public void show() {
		System.out.print(name + ", ¹ÝÁö¸§" + getRadius());
	}
}
public class Ex01 {

	public static void main(String[] args) {		
		NamedCircle w = new NamedCircle(6, "waffle");
		w.show();
	}

}
