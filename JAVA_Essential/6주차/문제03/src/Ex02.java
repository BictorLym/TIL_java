import java.util.*;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
class Sukbak01{
	String name[][];
	Sukbak01(){};
	Sukbak01(int floor, int room){
		name = new String[floor][room];
		
		for(int i = 0; i < floor; i++) {
			for(int j = 0; j < room; j++) {
				name[i][j] = "null";
			}
		}
		
		
		Scanner scanner = new Scanner(System.in);
		int input;
		
		do {
			try {
				System.out.print("1.���� 2.��� 3.��ü���� 4.���� =");
				input = scanner.nextInt();
				int enterFloor, enterRoom;
				String passengerName;
				int exitFloor, exitRoom;
				
				//1�� �Է��� ���, �� ���� �� ���濡 �������� �Է¹ް�, �̸��� �Է¹޴´�. 
				//��, ���� ���� ������ Ʋ���� ��� �Է� �޴´�.
				if(input==1)
				{
					try {
						System.out.print("�� ���� ����= ");
						enterFloor = scanner.nextInt();
						System.out.print("�� �� �濡 ����= ");
						enterRoom = scanner.nextInt();
						System.out.print("������ �̸�= ");
						passengerName = scanner.next();
						
						name[enterFloor][enterRoom] = passengerName;
					}
					catch(ArrayIndexOutOfBoundsException e) {
						do{							
							System.out.print("�� ���� ����= ");
							enterFloor = scanner.nextInt();
							System.out.print("�� �� �濡 ����= ");
							enterRoom = scanner.nextInt();
							System.out.print("������ �̸�= ");
							passengerName = scanner.next();
							
							name[enterFloor][enterRoom] = passengerName;
						}while(enterFloor>floor||enterRoom>room);
					}
				
				}
				//2�� �Է��� ���, �� ���� �� ���濡 ������� �Է¹޴´�.
				//�� �Է��� ���� ���� ������ Ʋ���� ��� �Է� �޴´�.
				if(input==2) 
				{
					try {
						System.out.print("�������� ���=");
						exitFloor = scanner.nextInt();
						System.out.print("��ȣ���� ���=");
						exitRoom = scanner.nextInt();
						name[exitFloor][exitRoom] = "null";
					}
					catch(ArrayIndexOutOfBoundsException e) {
						do {
							System.out.print("�������� ���=");
							exitFloor = scanner.nextInt();
							System.out.print("��ȣ���� ���=");
							exitRoom = scanner.nextInt();
							name[exitFloor][exitRoom] = "null";
						}while(exitFloor>floor||exitRoom>room);
					}
				}
				//3�� ���, ��ü���� ���
				if(input==3)
				{
					for(int i = 0; i < floor; i++) {
						System.out.println(i+"��!");
						for(int j = 0; j < room; j++) {
							System.out.print(j+"���� ������:" + name[i][j]+"\t");
						}
						System.out.println();
					}
					
				}
				//4�� ��� ����
				if(input==4)
				{
					System.out.println("���α׷��� �����մϴ�.!");
					scanner.close();
					System.exit(0);					
				}
				
			}
			catch(InputMismatchException e){
				System.out.print("1.���� 2.��� 3.��ü���� 4.���� = �߸� �Է�!");
				scanner.close();
				System.exit(0);
			}
		}while(true);
	}

}
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է�: ");
		int _floor_ = sc.nextInt();
		System.out.print("ȣ �� �Է�: ");
		int _room_ = sc.nextInt();
		Sukbak01 tmp = new Sukbak01(_floor_, _room_);
		//tmp.show();
		
		sc.close();
	}

}
