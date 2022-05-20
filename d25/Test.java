package practice;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("kim",5000);
		Student s2 = new Student("Lee",5000);
		Student s3 = new Student("jang",5000);
		Student s4 = new Student("son",5000);
		
		Bus b1 = new Bus("¸·Çô¿ä¿î¼ö");
		Subway sub1 = new Subway("Áö¿ÁÃ¶");
		s1.takeBus(b1);
		s1.takeSubway(sub1);
		s2.takeBus(b1);
		s3.takeSubway(sub1);
		s4.takeBus(b1);
		s4.takeSubway(sub1);
		
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		b1.showInfo();
		sub1.showInfo();
		
	}

}
