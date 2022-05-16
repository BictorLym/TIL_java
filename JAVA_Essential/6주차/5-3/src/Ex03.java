import java.util.*;
abstract class Calculator{
	protected int a, b;
	abstract protected int calc();
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요>>");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
}
class Adder extends Calculator{
	public int calc() {
		return a + b;
	}
	void set(int _a_, int _b_) {
		a = _a_;
		b = _b_;
	}
	void get() {
		System.out.println("a:"+a + "  "+ "b:"+b);
	}
}
class Subtracter extends Calculator{
	public int calc() {
		return a - b;
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
		
		adder.set(10, 100);
		adder.get();

	}

}
