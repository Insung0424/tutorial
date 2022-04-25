package ch16;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Gets the call from the queue in order.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign it to the counselor who currently has no counseling work or has the least waiting for counseling.");

	}

}
