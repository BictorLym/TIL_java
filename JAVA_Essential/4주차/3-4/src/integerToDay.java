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
			//char[] arr1 = {'아'};
			String[] arr = {"일", "월", "화", "수", "목", "금", "토" };
			
			System.out.print("정수를 입력하세요>>");
			try {
				temp = scanner.nextInt();
				if(temp<0) {
					System.out.println("프로그램을 종료합니다.");
					scanner.close();
					System.exit(0);
				}
				int dayIndex = temp%7;
				System.out.println(arr[dayIndex]);
			}
			catch(InputMismatchException e){
				System.out.println("경고! 수를 입력하지 않았습니다.");
				//scanner.nextLine();
			}
//			scanner.nextInt();
		}
	}
}
