package ch16;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
			System.out.println("Gets the call from the queue in order.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Distribute to the following callers.");

	}

}
