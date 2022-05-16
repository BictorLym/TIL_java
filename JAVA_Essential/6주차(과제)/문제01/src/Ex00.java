//별도의 Sungjuck 클래스를 만들어
//1) 이름, 국어 성적, 수학 성적, 영어 성적을
//입력받는 멤버 메서드,
//2) 합계와 평균을 구하는 멤버 메서드,
//3) 이름, 합계, 평균을 출력하는 멤버 메서드
//를 작성한다.
//메인 클래스에서는 해당 클래스의 객체를 생성
//하고 1), 2), 3)의 메서드만을 호출하여 아래와
//같은 결과를 출력하도록 한다.
import java.util.Scanner;
class Sungjuk{
	String name;
	int kor, math, eng;
	int sum;
	double avg;

	void setSungJuk(){
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 = ");
		String _name_ = sc.next();
		this.name = _name_;
		
		System.out.print("국어 = ");
		int _kor_ = sc.nextInt();
		this.kor = _kor_;
		
		System.out.print("영어 = ");
		int _math_ = sc.nextInt();
		this.math = _math_;
		
		System.out.print("수학 = ");
		int _eng_ = sc.nextInt();
		this.eng = _eng_;
		
		sc.close();
	}
	void setSumAvg() {
		this.sum = (kor+math+eng);
		this.avg = (double)sum/3.0;
	}
	void getNameSumAvg() {
		System.out.println("이름:" + name);
		System.out.println("tot:" + sum);
		System.out.println("avg:" + avg);
	}

}
public class Ex00 {

	public static void main(String[] args) {
		Sungjuk sungmi = new Sungjuk();
		sungmi.setSungJuk();
		sungmi.setSumAvg();
		sungmi.getNameSumAvg();
	}

}
