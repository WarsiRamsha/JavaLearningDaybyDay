package JavaQuestions;

public class FibonaaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 5 8 13 21 34
		int a = 0;
		int b = 1; //add these two.
		int sum = 0;
		for(int i=0; i<=9; i++) {
			sum= a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}

	}

}
