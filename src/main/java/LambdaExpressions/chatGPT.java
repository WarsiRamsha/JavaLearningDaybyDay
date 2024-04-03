package LambdaExpressions;

public class ClassB implements chatGPT {

	public static void main(String[] args) {
		ClassB classB = () -> System.out.println("Show 2");
		classB.startshow(); // Call the method defined in the interface
	}

	@Override
	public Void startshow() {
		System.out.println("Show 2");
		return null;
	}

}

@FunctionalInterface
public interface chatGPT {
	Void startshow();
}
