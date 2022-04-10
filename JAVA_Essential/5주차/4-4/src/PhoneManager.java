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
		System.out.print("�ο���>>");
		int n = sc.nextInt();
		
		Phone[] phoneArray = new Phone[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� �����������Է�)>>");
			String name = sc.next();
			String telno = sc.next();
			phoneArray[i] = new Phone(name, telno);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = sc.next();
			String telno = "";
			if(name.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�...");
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
				System.out.println(name + "�� �����ϴ�.");
			}
			else {
				System.out.println(name + "�� ��ȣ�� " + telno+ "�Դϴ�.");
			}
			
		}
	}
}
