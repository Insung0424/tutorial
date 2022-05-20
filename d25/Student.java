package practice;

public class Student {
	private String studentName;
	private int money;
	
	Student(String studentName,int money){
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"의 남은금액은"+money);
	}
}
