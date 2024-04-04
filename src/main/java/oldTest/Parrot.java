package oldTest;

public class Parrot implements Animal, bird {
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.makeSound();
		parrot.fly();
		parrot.eat();
		System.out.println(parrot.legs);
	}

	public void eat() {
		System.out.println("Parrots can eat up to 100 gms in a day");
	}

	public void makeSound() {
		System.out.println("Parrots make sound of screech");
	}
	public void fly() {
		System.out.println("Parrots can fly up to 50 miles in a day");
	}
}
