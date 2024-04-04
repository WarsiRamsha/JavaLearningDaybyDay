package oldTest;

public class SUVCar extends Car {
	public void fuelType() {
		System.out.println("SUV fuel type is Diesel");
	}

	public static void main(String[] args) {
		SUVCar suvCar = new SUVCar();
		suvCar.fuelType();

	}
}
