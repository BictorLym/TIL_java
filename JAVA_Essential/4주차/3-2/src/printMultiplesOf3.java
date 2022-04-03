import java.util.Scanner;
public class printMultiplesOf3 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		arr = scanAndStore();
		printArray(arr);
	}
	static int[] scanAndStore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 10개 입력>>");
		int [] temp = new int[10];
		for(int i = 0; i<10; i++)
		{
			temp[i] = sc.nextInt(); 
		}
		sc.close();
		return temp;
	}
	static void printArray(int[] arr) {
		int size = arr.length;
		for(int i = 0; i < size; i++)
		{
			if(arr[i]%3==0)
				System.out.print(arr[i] + " ");
		}
	}

}
