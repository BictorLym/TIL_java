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
				System.out.print("1.투숙 2.퇴실 3.전체보기 4.종료 =");
				input = scanner.nextInt();
				int enterFloor, enterRoom;
				String passengerName;
				int exitFloor, exitRoom;
				
				//1을 입력할 경우, 몇 층에 몇 번방에 투숙할지 입력받고, 이름을 입력받는다. 
				//단, 층과 방의 범위가 틀리면 계속 입력 받는다.
				if(input==1)
				{
					try {
						System.out.print("몇 층에 투숙= ");
						enterFloor = scanner.nextInt();
						System.out.print("몇 번 방에 투숙= ");
						enterRoom = scanner.nextInt();
						System.out.print("투숙객 이름= ");
						passengerName = scanner.next();
						
						name[enterFloor][enterRoom] = passengerName;
					}
					catch(ArrayIndexOutOfBoundsException e) {
						do{							
							System.out.print("몇 층에 투숙= ");
							enterFloor = scanner.nextInt();
							System.out.print("몇 번 방에 투숙= ");
							enterRoom = scanner.nextInt();
							System.out.print("투숙객 이름= ");
							passengerName = scanner.next();
							
							name[enterFloor][enterRoom] = passengerName;
						}while(enterFloor>floor||enterRoom>room);
					}
				
				}
				//2를 입력할 경우, 몇 층에 몇 번방에 퇴실할지 입력받는다.
				//단 입력이 층과 방의 범위가 틀리면 계속 입력 받는다.
				if(input==2) 
				{
					try {
						System.out.print("몇층에서 퇴실=");
						exitFloor = scanner.nextInt();
						System.out.print("몇호에서 퇴실=");
						exitRoom = scanner.nextInt();
						name[exitFloor][exitRoom] = "null";
					}
					catch(ArrayIndexOutOfBoundsException e) {
						do {
							System.out.print("몇층에서 퇴실=");
							exitFloor = scanner.nextInt();
							System.out.print("몇호에서 퇴실=");
							exitRoom = scanner.nextInt();
							name[exitFloor][exitRoom] = "null";
						}while(exitFloor>floor||exitRoom>room);
					}
				}
				//3일 경우, 전체보기 출력
				if(input==3)
				{
					for(int i = 0; i < floor; i++) {
						System.out.println(i+"층!");
						for(int j = 0; j < room; j++) {
							System.out.print(j+"번방 투숙객:" + name[i][j]+"\t");
						}
						System.out.println();
					}
					
				}
				//4의 경우 종료
				if(input==4)
				{
					System.out.println("프로그램을 종료합니다.!");
					scanner.close();
					System.exit(0);					
				}
				
			}
			catch(InputMismatchException e){
				System.out.print("1.투숙 2.퇴실 3.전체보기 4.종료 = 잘못 입력!");
				scanner.close();
				System.exit(0);
			}
		}while(true);
	}

}
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("층 수 입력: ");
		int _floor_ = sc.nextInt();
		System.out.print("호 수 입력: ");
		int _room_ = sc.nextInt();
		Sukbak01 tmp = new Sukbak01(_floor_, _room_);
		//tmp.show();
		
		sc.close();
	}

}
