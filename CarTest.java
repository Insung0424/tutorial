package ch10;

public class CarTest {

	public static void main(String[] args) {
			Car aicar = new AlCar();
			aicar.run();
			
			Car mcar = new ManualCar();
			mcar.run();
	}

}
