import java.util.Scanner;
import java.util.InputMismatchException;
public class integerToDay {

	public static void main(String[] args) {
		integerToDay1();

	}
	static void integerToDay1(){

		while(true) {
			Scanner scanner = new Scanner(System.in);
			int temp;
			//char[] arr1 = {'��'};
			String[] arr = {"��", "��", "ȭ", "��", "��", "��", "��" };
			
			System.out.print("������ �Է��ϼ���>>");
			try {
				temp = scanner.nextInt();
				if(temp<0) {
					System.out.println("���α׷��� �����մϴ�.");
					scanner.close();
					System.exit(0);
				}
				int dayIndex = temp%7;
				System.out.println(arr[dayIndex]);
			}
			catch(InputMismatchException e){
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				//scanner.nextLine();
			}
//			scanner.nextInt();
		}
	}
}
