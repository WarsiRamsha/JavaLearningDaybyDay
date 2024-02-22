
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answ =sum(115,10);
		System.out.println(answ);
		int subtractedAnswer =subtract(100, 50); //This name can be any name
		System.out.println(subtractedAnswer);
		int divisionAnswer = division(100, 2);
		System.out.println(divisionAnswer);
		

	}
	private static int division(int i, int j) {
		int answer = i/j;
		return answer;
	}
	private static int subtract(int i, int j) {
		// TODO Auto-generated method stub
		int answer= i-j;
		return answer;
		
	}

	private static int sum(int i, int j) {
		// TODO Auto-generated method stub
		int answ =i+j;
		return answ;
		
	}

}
