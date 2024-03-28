package Methods;

public class MethodOverloading {
	public static void main(String[] args) {
		int answer = (int) toAdd(1.5,2);
		System.out.println(answer);
		}

	public static int toAdd(int a, int b) {
		return a + b;
	}
	public static double toAdd(double a, int b) {
		return a+b;
	}
}
