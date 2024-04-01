package Methods;

class SampleX {
	public static void show() {
		System.out.println("Hello Class A");
	}
}

class SampleY {
	public static void show() {
		System.out.println("Hello Class B");
	}
}
	class SampleZ extends SampleX{
		public static void show() {
			System.out.println("I am in class B and this method is overwritten");
		}
	}


public class MethodOverriddingDifferentClassesSameMethods {

	public static void main(String[] args) {
		SampleZ.show();

	}

}
