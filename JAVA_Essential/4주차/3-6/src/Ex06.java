import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		String eng[] = { "student", "love", "java", "happy", "future"};
		String kor[] = { "학생",		"사랑",	"자바",	"행복한",	"미래" };
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("영어단어를 입력하세요>>");
			String str = scanner.next();
			if(str.equals("exit")) {
				System.out.println("종료합니다...");
				scanner.close();
				System.exit(0);
			}
			else {
				for(int i = 0; i < 5; i++) {
					if(str.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
					if(i==4)	System.out.println("그런 단어가 없습니다.");
				}
			}
				
		}

	}
}
