package ch15;

public class TakeTest {

	public static void main(String[] args) {
			
		Student studentJ = new Student("James" , 20000);

		Taxi taxi123 = new Taxi("잘나간다 운수택시");
		studentJ.takeTaxi(taxi123);

		studentJ.showInfo();
		
		taxi123.showTaxiInfo();

		
	}

}
