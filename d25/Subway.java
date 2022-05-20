package practice;

public class Subway {
	
	private String subwayName;
	private int income;
	private int tourist;
	
	Subway(String subwayName){
		this.subwayName = subwayName;
		this.tourist = 0;
	}
	
	public void take(int money) {
		tourist++;
		income += money;
	}
	
	public void showInfo() {
		System.out.println(subwayName+"ÀÇ ÃÑ ½Â°´Àº "+tourist+"ÀÌ°í ¼öÀÔÀº "+income);
	}
	
}
