import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		int arr[] = new int[10];
		makeArray(arr);
		sort(arr);
		printArray(arr);
	}
	static void makeArray(int[] arr) {
		System.out.print("정수 10개 입력>>");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 10; i ++)
		{
			arr[i] = scanner.nextInt();
		}
		scanner.close();
	}
	static void printArray(int[] arr) {
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void sort(int[] arr) {
		int size = arr.length, tmp;
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size-1; j++)
			{
				if(arr[j] > arr[j+1])	{
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
