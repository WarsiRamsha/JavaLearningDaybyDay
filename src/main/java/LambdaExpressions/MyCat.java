package LambdaExpressions;


public class MyCat implements Cat{

	public MyCat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCat myCat = new MyCat();
		myCat.voice();
	}

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}

}
