package review01;

public class Car {

	private static int serialNumber = 1;
	private int carNum;
	
	public Car () {
		serialNumber++;
		carNum = serialNumber;
	}

	public int getCarNum() {
		return carNum;
	}
	
	
}
