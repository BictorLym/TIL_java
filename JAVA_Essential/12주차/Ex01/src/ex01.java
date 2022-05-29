import java.util.*;
class Person{
	private String name;
	private String jumin;
	public Person() {
		name = "guest";
		jumin="000000-0000000";
	}
	class sungjuk{
		int kor, eng, math, tot;
		float avg;
		public void disp2() {
			//메서드 추가
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름:");
			name = sc.next();
			System.out.print("주민번호:");
			jumin = sc.next();
			System.out.print("영어:");
			kor = sc.nextInt();
			System.out.print("국어:");
			eng = sc.nextInt();
			System.out.print("수학:");
			math = sc.nextInt();
			
			tot = kor+eng+math;
			avg = (float)(tot) / (float)3;
			
			disp();
			System.out.println("영어:"+eng);
			System.out.println("국어:"+kor);
			System.out.println("수학:"+math);
		}
	}
	public Person(String _name_, String _jumin_) {
		name = _name_;
		jumin = _jumin_;
	}
	public void disp() {
		System.out.println("이름:" + name);
		System.out.println("주민번호:"+jumin);
	}
}
public class ex01 {

	public static void main(String[] args) {
		Person p = new Person();
		Person.sungjuk s = p.new sungjuk();
		//Person.sungjuk s2 = new sungjuk();	//static일때 사용가능
		s.disp2();

	}

}
