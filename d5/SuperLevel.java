package ch16;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("He runs Super fast");
		
	}

	@Override
	public void jump() {
		System.out.println("He jumps Super high");
	}

	@Override
	public void turn() {
		System.out.println("He turns");	
	}

	@Override
	public void showLevelMessage() {
		System.out.println("He is at SuperLevel");
	}

}
