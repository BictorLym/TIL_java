import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		GameRocSciPap();

	}
	static void GameRocSciPap() {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ ���� �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��! >> ");
			String User = sc.next();
			
			int Ai = (int)(Math.random()*3);
			
			if(User.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break;
			}
			else if(str[Ai].equals("����")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(str[Ai].equals("����")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
			}
			else if(str[Ai].equals("��")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
				}
			}
		}
	}
}
