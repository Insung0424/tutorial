package review01;

public class TakeTransportationTest {

	public static void main(String[] args) {
		
			Student jar = new Student("jar", 20000);
			
			Taxi taxi = new Taxi(2345);
			
			jar.takeTaxi(taxi);
			
			System.out.println(jar.toString());
			System.out.println(taxi.toString());
	}

}
