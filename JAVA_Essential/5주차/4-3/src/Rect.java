import java.util.Scanner;
public class Rect {
	private int width, height;
	public Rect(){
		width = 1;
		height = 1;
	}
	public Rect(int _width_, int _height_){
		width = _width_;
		height = _height_;
	}
	public int getArea() {
		return width*height;
	}
	public void set(int _width_, int _height_) {
		width = _width_;
		height = _height_;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rect [] rect = new Rect[4];
		int sum = 0;
		for(int i = 0; i < 4; i++)
		{
			System.out.print((i+1) + "너비와 높이 >>");
			int width_ = scanner.nextInt();
			int height_ = scanner.nextInt();
			rect[i] = new Rect(width_, height_);
			sum += rect[i].getArea();
		}
		System.out.println("저장하였습니다...");
		System.out.println("사각형의 전체 합은 " + sum);

	}

}
