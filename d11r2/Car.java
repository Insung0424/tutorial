package review01;

public class Car {

	//static 을 이용한 예제
	private static int serialNumber = 10000;
	private int carNum;
	
	Car(){
		serialNumber++;
		carNum = serialNumber;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	

	
}
