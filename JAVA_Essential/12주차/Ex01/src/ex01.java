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
			//�޼��� �߰�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸�:");
			name = sc.next();
			System.out.print("�ֹι�ȣ:");
			jumin = sc.next();
			System.out.print("����:");
			kor = sc.nextInt();
			System.out.print("����:");
			eng = sc.nextInt();
			System.out.print("����:");
			math = sc.nextInt();
			
			tot = kor+eng+math;
			avg = (float)(tot) / (float)3;
			
			disp();
			System.out.println("����:"+eng);
			System.out.println("����:"+kor);
			System.out.println("����:"+math);
		}
	}
	public Person(String _name_, String _jumin_) {
		name = _name_;
		jumin = _jumin_;
	}
	public void disp() {
		System.out.println("�̸�:" + name);
		System.out.println("�ֹι�ȣ:"+jumin);
	}
}
public class ex01 {

	public static void main(String[] args) {
		Person p = new Person();
		Person.sungjuk s = p.new sungjuk();
		//Person.sungjuk s2 = new sungjuk();	//static�϶� ��밡��
		s.disp2();

	}

}
