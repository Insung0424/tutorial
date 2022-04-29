package r2;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("대기가 적은 상담원 우선");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원 우선");				
	}

}
