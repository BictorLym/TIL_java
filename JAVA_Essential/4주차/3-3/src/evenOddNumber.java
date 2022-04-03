import java.util.Scanner;
import java.util.InputMismatchException;
public class evenOddNumber {

	public static void main(String[] args) {
		printEvenAndOdd();

	}
	static void printEvenAndOdd() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		
		try {
			int tmp = scanner.nextInt();
			if(tmp%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			
			
		}
		catch(InputMismatchException e){
			System.out.println("수를 입력하세요");
		}
		finally {
			scanner.close();
		}
		
		
	}
}
