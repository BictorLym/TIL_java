import java.util.*;
public class Graffiti {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char tmp = input.charAt(0);
		char a = 'a';
		for(int i = tmp ; i >= a; i--)
		{
			char output = (char)i;
			System.out.print(output);
		}
		
		sc.close();
	}
}
