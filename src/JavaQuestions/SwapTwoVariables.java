package JavaQuestions;

public class SwapTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 5;
		System.out.println("Value of a " + a);
		System.out.println("Value of b " + b);
		System.out.println("----");
		int temp;
		temp = a;
		a = temp;
		System.out.println("Both are same " +temp);
		System.out.println(a);
		System.out.println("----");
		
		//a=temp;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);

	}

}
