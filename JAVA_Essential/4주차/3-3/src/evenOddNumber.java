import java.util.Scanner;
import java.util.InputMismatchException;
public class evenOddNumber {

	public static void main(String[] args) {
		printEvenAndOdd();

	}
	static void printEvenAndOdd() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		
		try {
			int tmp = scanner.nextInt();
			if(tmp%2==0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
			
			
		}
		catch(InputMismatchException e){
			System.out.println("���� �Է��ϼ���");
		}
		finally {
			scanner.close();
		}
		
		
	}
}
