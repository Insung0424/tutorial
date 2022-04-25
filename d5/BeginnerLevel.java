package ch16;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("He runs slowly");
	}

	@Override
	public void jump() {
		System.out.println("He can't jump");
	}

	@Override
	public void turn() {
		System.out.println("He can't turn");	
	}

	@Override
	public void showLevelMessage() {
		System.out.println("He is at BeginnerLevel");
	}
		
}
