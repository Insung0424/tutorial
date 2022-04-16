package ch06;

public class StudentTest {

	public static void main(String[] args) {
			Student studentJung = new Student();
			System.out.println(studentJung.showStudentInfo());
			
			Student studentIn = new Student(123456, "In", 3);
			System.out.println(studentIn.showStudentInfo());
	}
	

}
