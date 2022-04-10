
public class Box {
	private int width, height;	//박스 너비와 높이
	private char fillChar;		//박스를 그리는 데 사용하는 문자
	
	public Box() {
		this.width = 10;
		this.height = 1;
	}
	public Box(int _width_, int _height_) {
		this.width = _width_;
		this.height = _height_;
	}
	public void draw() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(fillChar);
			}
			System.out.println();
		}
	}
	public void fill(char c) {
		this.fillChar = c;
	}
	public static void main(String[] args) {
		Box a = new Box();
		Box b = new Box(20, 3);
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}

}
