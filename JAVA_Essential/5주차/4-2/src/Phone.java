import java.util.Scanner;
public class Phone {
	private String name, tel;
	
	public Phone() {
		name = "NULL";
		tel = "NULL";
	}
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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name1 = scanner.next();
		String tel1 = scanner.next();
		Phone phone1 = new Phone(name1, tel1);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		String name2 = scanner.next();
		String tel2 = scanner.next();
		Phone phone2 = new Phone(name2, tel2);
		
		System.out.println(phone1.getName()+"�� ��ȣ " + phone1.getTel());
		System.out.println(phone2.getName()+"�� ��ȣ " + phone2.getTel());
	}

}
