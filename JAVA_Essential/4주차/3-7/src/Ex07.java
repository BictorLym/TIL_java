
public class Ex07 {

	public static void main(String[] args) {
		int i;
		
		for(i = 1; i <= 99; i++) {
			int clap = 0;
			int first = i%10;
			int second = i/10;
			if(first!=0 && first%3 == 0)
				clap++;
			if(second!=0 && second%3 == 0)
				clap++;
			if(clap==1)	System.out.println(i + "박수한번");
			if(clap==2) System.out.println(i + "박수두번");
		}
	}
}
