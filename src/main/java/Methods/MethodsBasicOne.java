package Methods;

public class MethodsBasicOne {

	public MethodsBasicOne() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		toPrintNumberEvenOrOdd(n);
		
	}

	private static void toPrintNumberEvenOrOdd(int a) {
		// TODO Auto-generated method stub
		if(a%2==0) {
			System.out.println("Number is even");
		} 
		else {
			System.out.println("Number is odd");
		}
	}

}
