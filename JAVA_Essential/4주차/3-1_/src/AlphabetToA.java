import java.util.Scanner;

public class AlphabetToA {

	public static void main(String[] args) {
		printFromXToA();


	}
	static void printFromXToA() {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String s = sc.next();
		char c = s.charAt(0);
		
		for (int i = 0; i <= c-'a'; i++) {
			for (int j = i; j <= c-'a'; j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
		sc.close();
	}
}
