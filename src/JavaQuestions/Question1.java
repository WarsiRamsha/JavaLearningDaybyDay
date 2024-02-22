//create a method which accepts arrays and returns the sum of 
//all
public class Question1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int answer = sumArray(a);
		System.out.println(answer);
		
		
	}
	private static int sumArray(int a[]) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			sum = sum+a[i];
		} 
		return sum;
	}
}


