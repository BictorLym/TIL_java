import java.util.*;
interface StackInterface{
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterface{
	String[] stack = new String[5];
	private int top = -1;
	public int length() {
		return top + 1;
	}
	public String pop() {
		return stack[top--];
	}
	public boolean push(String ob) {
		if(length()==5) {
			return false;
		}
		else {
			stack[++top] = ob;
			return true;
		}
	}
	
}
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStack s = new StringStack();
		
		System.out.print(">>");
		for(int i = 0; i < 5; i++) {
			s.push(sc.next());
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(s.pop() + " ");
		}
	}
}
