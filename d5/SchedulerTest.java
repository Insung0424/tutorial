package ch16;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
			System.out.println("Please select a method of allocating telephone counselors");
			System.out.println("R : One by one");
			System.out.println("L : Low-Waiting Counsellors First");
			System.out.println("P : High-priority customers High-skilled consultants");

			int ch = System.in.read();
			Scheduler scheduler = null;
			
			if (ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			}
			else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			}
			else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			}
			else {
				System.out.println("This feature is not supported.");
				return;
			}
			
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
	}

}
