//난수 발생 메서드 (int)(Math.random() * 10) 를 이용하여 오른쪽과 같은 결과를 출력하시오 .
// Math.random() : 0.0 ~ 0.9999 값 리턴  (int)(Math.random() *10) : 0 ~ 9 값 리턴

import java.util.*;

class Baseball{
	int[] strikeBallNumber;
	int cnt;
	
	Baseball(){
		//StrikeBall 생성기
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
		//디버깅 및 정답용
		System.out.print("정답");
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
			System.out.print("세개수를 연속적으로 입력 = ");
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
				System.out.println(cnt + "번째에 맞추셨습니다.");
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
