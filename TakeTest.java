package ch14;

public class TakeTest {

	public static void main(String[] args) {
			
		Student studentJ = new Student("James" , 5000);
		Student studentT = new Student("Tomas" , 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway subway1 = new Subway(1);
		studentT.takeSubway(subway1);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		subway1.showSubwayInfo();
		
		bus500.showBusInfo();
	}

}
