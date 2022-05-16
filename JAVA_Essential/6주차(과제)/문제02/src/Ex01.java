//별도의 Per_info 클래스를 만들어
//1) 이름 입력받는 멤버 메서드,
//2) 나이를 입력받는 멤버 메서드,
//3) 이름, 나이를 출력하는 멤버 메서드
//를 작성한다.
//이때 생성자를 이용하여 이름은 공백, 나이는 0
//으로 초기화한다.
//메인 클래스에서는 해당 클래스의 객체를 생성
//하고 1), 2), 3)의 메서드만을 호출하여 아래와
//같 은 결과를 출력하도록 한다.
import java.util.Scanner;
class Per_info{
	String name;
	int age;
	
	Per_info(){
		name = " ";
		age = 0;
	}
	void setName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 = ");
		String _name_ = sc.next();
		this.name = _name_;
		
		//sc.close();
	}
	void setAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 = ");
		int _age_ = sc.nextInt();
		this.age = _age_;
		
		sc.close();
	}
	void getNameAge() {
		System.out.println( name +"미님!");
		System.out.println("당신은 "+ age +"세 이시군요!");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Per_info sungmi = new Per_info();
		sungmi.setName();
		sungmi.setAge();
		sungmi.getNameAge();

	}

}
