//���� �߻� �޼��� (int)(Math.random() * 10) �� �̿��Ͽ� �����ʰ� ���� ����� ����Ͻÿ� .
// Math.random() : 0.0 ~ 0.9999 �� ����  (int)(Math.random() *10) : 0 ~ 9 �� ����

import java.util.*;

class Baseball{
	int[] strikeBallNumber;
	int cnt;
	
	Baseball(){
		//StrikeBall ������
		int size = 3;
		strikeBallNumber = new int[size];
		cnt = 0;
		for(int i = 0; i < size; i++)
		{
			strikeBallNumber[i] = (int)(Math.random()*10);
			for(int j = 0; j < i; j++) {
				if(strikeBallNumber[i]==strikeBallNumber[j]) {
					i--;
					break;
				}
			}
		}
		//����� �� �����
		System.out.print("����");
		for(int i = 0; i < size; i++)
		{
			System.out.print(strikeBallNumber[i]);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int input;
		int [] inputDigit;
		boolean ans = false;
		inputDigit = new int[3];
		
		do {
			cnt++;
			int strike = 0, ball = 0;
			System.out.print("�������� ���������� �Է� = ");
			input = sc.nextInt();
			for(int i = 2; i >= 0; i--)
			{
				inputDigit[i] = input%10;
				input = input /10;
			}

			for(int i = 0; i < size; i++)
			{
				if(strikeBallNumber[i]==inputDigit[i])
				{
					strike++;
				}
				else
				{
					for(int j = 0; j < size ; j++)
					{
						if(inputDigit[i]==strikeBallNumber[j])
						{
							ball++;
						}
					}
				}
			}
			if(strike==3) {
				System.out.println(strike+"strike, "+ ball+"ball!");
				System.out.println(inputDigit[0]+"\t"+inputDigit[1]+
						"\t"+inputDigit[2]+"\t");
				System.out.println(cnt + "��°�� ���߼̽��ϴ�.");
				ans = true;
			}
			else {
				System.out.println(strike+"strike, "+ ball+"ball!");
				
			}
		}while(!ans);
		
		//sc.close();
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Baseball first_game = new Baseball(); 

	}

}
