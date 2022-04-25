package ch24;

public class StudentTest {

	public static void main(String[] args) {
			Student studentLee = new Student(1001, "Lee");
			
			studentLee.addsubject("국어", 100);
			studentLee.addsubject("수학", 50);
			
			Student studentKim = new Student(1002, "Kim");
			
			studentKim.addsubject("국어", 70);
			studentKim.addsubject("수학", 85);
			studentKim.addsubject("영어", 100);
			
			studentLee.showScoreInfo();
			System.out.println("========================");
			studentKim.showScoreInfo();
	}

}
