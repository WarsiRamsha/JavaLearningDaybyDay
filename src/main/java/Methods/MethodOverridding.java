package Methods;

class Sample1 {
	public static void show() {
		System.out.println("Hello Class A");
	}
}

class SampleB {
	public static void show() {
		System.out.println("Hello Class B");
	}
}
	class SampleA extends Sample1{
		
	}


public class MethodOverridding {

	public static void main(String[] args) {
		SampleB.show();

	}

}
