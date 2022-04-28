import java.util.*;
class Score{
	Scanner sc = new Scanner(System.in);
	String[] name;
	int[] kor ;
	int[] eng;
	int[] math;
	int[] tot;
	double[] avg;
	int[] rank;
	int n;
	Score(){
		System.out.print("인원 : ");
		n = sc.nextInt();
		name = new String[n];
		kor = new int[n];
		eng= new int[n];
		math = new int[n];
		tot = new int[n];
		avg = new double[n];
		rank = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print(i+1+"번째 사람 이름 = ");
			String _name = sc.next();
			name[i] = _name;
			
			System.out.print(i+1+"번째 사람 국어 = ");
			int _kor = sc.nextInt();
			kor[i] = _kor;
			
			System.out.print(i+1+"번째 사람 수학 = ");
			int _math = sc.nextInt();
			math[i] = _math;
			
			System.out.print(i+1+"번째 사람 영어 = ");
			int _eng = sc.nextInt();
			eng[i] = _eng;
			
			tot[i] = calcTot(i);
			avg[i] = calcAvg(i);
		}
		for(int i = 0; i < n; i++) {
			rank[i]=calcRank(i, n);
		}
	}
	int calcTot(int i){
		int total = kor[i] + math[i] + eng[i];
		return total;
	}
	double calcAvg(int i) {
		int average = (kor[i] + math[i] + eng[i])/3; 
		return average;
	}
	int calcRank(int i, int n) {
		int _rank = 1;
		for(int j = 0; j < n; j++) {
			if(avg[i]<avg[j]) {
				_rank++;
			}
		}
		return _rank;
	}
	
	void print_head() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차1");
	}
	void print_value() {
		for(int i = 0; i < n; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
			
		}
	}
}
public class ex04 {

	public static void main(String[] args) {
		Score scr = new Score();
		
		scr.print_head();
		scr.print_value();

	}

}
