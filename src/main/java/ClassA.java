
public class ClassA {

	public static void main(String[] Args) {
		System.out.println("Hello java from main");
		toPrintHello();
		ClassA classA= new ClassA();
		classA.nonstaticHello();
	}

	public static void toPrintHello() {
		System.out.println("Static Hello");
	}
	public void nonstaticHello() {
		System.out.println("Nonstatic Hello");
	}
}
