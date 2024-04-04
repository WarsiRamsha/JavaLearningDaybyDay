package LambdaExpressions;

public class Animal implements Sound, legs {

	public static void main(String[] args) {
		Animal animalCat = new Animal();
		animalCat.makeSound();
		animalCat.startWalking();

	}

	public void makeSound() {
		System.out.println("Cat: Meow");

	}

	@Override
	public void startWalking() {
		// TODO Auto-generated method stub
		System.out.println("Cat: 4 legs");

	}

}
