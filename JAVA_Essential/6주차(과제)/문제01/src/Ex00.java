//������ Sungjuck Ŭ������ �����
//1) �̸�, ���� ����, ���� ����, ���� ������
//�Է¹޴� ��� �޼���,
//2) �հ�� ����� ���ϴ� ��� �޼���,
//3) �̸�, �հ�, ����� ����ϴ� ��� �޼���
//�� �ۼ��Ѵ�.
//���� Ŭ���������� �ش� Ŭ������ ��ü�� ����
//�ϰ� 1), 2), 3)�� �޼��常�� ȣ���Ͽ� �Ʒ���
//���� ����� ����ϵ��� �Ѵ�.
import java.util.Scanner;
class Sungjuk{
	String name;
	int kor, math, eng;
	int sum;
	double avg;

	void setSungJuk(){
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� = ");
		String _name_ = sc.next();
		this.name = _name_;
		
		System.out.print("���� = ");
		int _kor_ = sc.nextInt();
		this.kor = _kor_;
		
		System.out.print("���� = ");
		int _math_ = sc.nextInt();
		this.math = _math_;
		
		System.out.print("���� = ");
		int _eng_ = sc.nextInt();
		this.eng = _eng_;
		
		sc.close();
	}
	void setSumAvg() {
		this.sum = (kor+math+eng);
		this.avg = (double)sum/3.0;
	}
	void getNameSumAvg() {
		System.out.println("�̸�:" + name);
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
