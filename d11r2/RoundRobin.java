package r2;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("한명씩 차례대로");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("한명씩 차례대로");		
	}

}
