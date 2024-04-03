package LambdaExpressions;

public class ClassB implements showB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB classB = () -> System.out.println("Show 2");
		classB.startShow();

	}

	private void startShow() {
		// TODO Auto-generated method stub
		
	}

}
