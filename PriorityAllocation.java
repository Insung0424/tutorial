package ch16;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Import a call from a customer with a high customer rating first");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Distribute first to highly skilled counselors");

	}

}
