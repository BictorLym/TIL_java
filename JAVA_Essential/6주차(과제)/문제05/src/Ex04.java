
import java.util.Scanner;
//Base 클래스 - 사람의 이름, 주민번호 관리 (주민번호는 111111-1111118으로 고정)
class Base{
	String name;
	final String ID = "111111-1111118";
	Base(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름=");
		name =sc.next();
		
		String inputID;
		do {
			System.out.print("주민번호=");
			inputID = sc.next();
			if(!inputID.equals(ID)) {
				System.out.println("주민번호가 다릅니다.");
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

		System.out.print("국어 = ");
		int _kor_ = sc.nextInt();
		this.kor = _kor_;
		
		System.out.print("영어 = ");
		int _math_ = sc.nextInt();
		this.math = _math_;
		
		System.out.print("수학 = ");
		int _eng_ = sc.nextInt();
		this.eng = _eng_;

		setSumAvg();
		setGrade();
	}
	void setGrade() {
		if(avg >= 90) {
			grade = "A학점";
		}
		else if (avg >= 80) {
			grade = "B학점";
		}
		else if (avg >= 70) {
			grade = "C학점";
		}
		else if (avg>=60) {
			grade = "D학점";
		}
		else {
			grade = "F학점";
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
		System.out.println("석차: " + rank + "등");
	}
	void getGrade() {
		System.out.println("학점: " + grade);
	}
	void getNameSumAvg() {
		System.out.println(name+"님~!");
		System.out.println();
		System.out.println("총점:" + sum +"점");
		System.out.println("평균:" + avg + "점");
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
		System.out.print("키=");
		height = sc.nextDouble();
	}
	void setWeight() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게=");
		weight = sc.nextDouble()-5.0;
	}
	void setEyes() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시력=");
		eyes = sc.nextDouble()+0.5;
	}
	void disp() {
		System.out.println("키="+height+"cm");
		System.out.println("몸무게="+weight+"kg");
		System.out.println("시력="+eyes);
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
