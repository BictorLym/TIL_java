//������ Per_info Ŭ������ �����
//1) �̸� �Է¹޴� ��� �޼���,
//2) ���̸� �Է¹޴� ��� �޼���,
//3) �̸�, ���̸� ����ϴ� ��� �޼���
//�� �ۼ��Ѵ�.
//�̶� �����ڸ� �̿��Ͽ� �̸��� ����, ���̴� 0
//���� �ʱ�ȭ�Ѵ�.
//���� Ŭ���������� �ش� Ŭ������ ��ü�� ����
//�ϰ� 1), 2), 3)�� �޼��常�� ȣ���Ͽ� �Ʒ���
//�� �� ����� ����ϵ��� �Ѵ�.
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
		
		System.out.print("�̸� = ");
		String _name_ = sc.next();
		this.name = _name_;
		
		//sc.close();
	}
	void setAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� = ");
		int _age_ = sc.nextInt();
		this.age = _age_;
		
		sc.close();
	}
	void getNameAge() {
		System.out.println( name +"�̴�!");
		System.out.println("����� "+ age +"�� �̽ñ���!");
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
