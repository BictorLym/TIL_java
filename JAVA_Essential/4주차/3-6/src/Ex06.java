import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		String eng[] = { "student", "love", "java", "happy", "future"};
		String kor[] = { "�л�",		"���",	"�ڹ�",	"�ູ��",	"�̷�" };
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("����ܾ �Է��ϼ���>>");
			String str = scanner.next();
			if(str.equals("exit")) {
				System.out.println("�����մϴ�...");
				scanner.close();
				System.exit(0);
			}
			else {
				for(int i = 0; i < 5; i++) {
					if(str.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
					if(i==4)	System.out.println("�׷� �ܾ �����ϴ�.");
				}
			}
				
		}

	}
}
