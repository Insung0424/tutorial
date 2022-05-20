package practice;

public class Bus {
	
	private String busName;
	private int income;
	private int tourist;
	
	Bus(String busName){
		this.busName = busName;
		this.tourist = 0;
	}
	
	public void take(int money) {
		tourist++;
		income += money;
	}
	
	public void showInfo() {
		System.out.println(busName+"ÀÇ ÃÑ ½Â°´Àº "+tourist+"ÀÌ°í ¼öÀÔÀº "+income);
	}
	
}
