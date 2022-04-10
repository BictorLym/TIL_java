import java.util.Scanner;
class Phone{
	private String name,  tel;
	
	public Phone(String _name_, String _tel_) {
		name = _name_;
		tel = _tel_;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

public class PhoneManager {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = sc.nextInt();
		
		Phone[] phoneArray = new Phone[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("이름과 전화번호(번호는 연속적으로입력)>>");
			String name = sc.next();
			String telno = sc.next();
			phoneArray[i] = new Phone(name, telno);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			String telno = "";
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				sc.close();
				System.exit(0);
			}
			else {
				for(int i = 0; i < n; i++) {
					if(name.equals(phoneArray[i].getName())) {
						telno = phoneArray[i].getTel();
					}
				}
			}
			if(telno=="") {
				System.out.println(name + "이 없습니다.");
			}
			else {
				System.out.println(name + "의 번호는 " + telno+ "입니다.");
			}
			
		}
	}
}
