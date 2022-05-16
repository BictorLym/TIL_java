
import java.util.Scanner;
//Base Ŭ���� - ����� �̸�, �ֹι�ȣ ���� (�ֹι�ȣ�� 111111-1111118���� ����)
class Base{
	String name;
	final String ID = "111111-1111118";
	Base(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�=");
		name =sc.next();
		
		String inputID;
		do {
			System.out.print("�ֹι�ȣ=");
			inputID = sc.next();
			if(!inputID.equals(ID)) {
				System.out.println("�ֹι�ȣ�� �ٸ��ϴ�.");
			}
		}while(!inputID.equals(ID));
	}
	Base(String _name_, String _jumin_){
		this.name = _name_;
		//this.ID = "111111-1111118";
	}
	String getName() {
		return name;
	}
	String getJumin() {
		return ID;
	}
}
class Sungjuk extends Base{
	//String name;
	int kor, math, eng;
	int sum;
	String grade;
	double avg;
	final int rank = 1;
	
	Sungjuk(){
		setSungJuk();
	}

	void setSungJuk(){
		Scanner sc = new Scanner(System.in);

		System.out.print("���� = ");
		int _kor_ = sc.nextInt();
		this.kor = _kor_;
		
		System.out.print("���� = ");
		int _math_ = sc.nextInt();
		this.math = _math_;
		
		System.out.print("���� = ");
		int _eng_ = sc.nextInt();
		this.eng = _eng_;

		setSumAvg();
		setGrade();
	}
	void setGrade() {
		if(avg >= 90) {
			grade = "A����";
		}
		else if (avg >= 80) {
			grade = "B����";
		}
		else if (avg >= 70) {
			grade = "C����";
		}
		else if (avg>=60) {
			grade = "D����";
		}
		else {
			grade = "F����";
		}
	}
	void setSumAvg() {
		this.sum = (kor+math+eng);
		this.avg = (double)sum/3.0;
	}
	void disp() {
		getNameSumAvg();
		getGrade();
		getRank();
		System.out.println();System.out.println();
	}
	void getRank() {
		System.out.println("����: " + rank + "��");
	}
	void getGrade() {
		System.out.println("����: " + grade);
	}
	void getNameSumAvg() {
		System.out.println(name+"��~!");
		System.out.println();
		System.out.println("����:" + sum +"��");
		System.out.println("���:" + avg + "��");
	}

}
class Mypersoninfo extends Base{
	//String name;
	double  height, weight, eyes;
	
	
	Mypersoninfo(String _name_, String _jumin_){
		super(_name_, _jumin_);
		setHeight();
		setWeight();
		setEyes();
	}
	void setHeight() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű=");
		height = sc.nextDouble();
	}
	void setWeight() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������=");
		weight = sc.nextDouble()-5.0;
	}
	void setEyes() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�÷�=");
		eyes = sc.nextDouble()+0.5;
	}
	void disp() {
		System.out.println("Ű="+height+"cm");
		System.out.println("������="+weight+"kg");
		System.out.println("�÷�="+eyes);
	}

}



public class Ex04 {

	public static void main(String[] args) {
		Sungjuk sj = new Sungjuk();
		Mypersoninfo pi = new Mypersoninfo(sj.getName(), sj.getJumin());
		System.out.println();
		System.out.println();
		sj.disp();
		pi.disp();
	}

}
