package ch16;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("He runs very fast");
		
	}

	@Override
	public void jump() {
		System.out.println("He jumps very high");
	}

	@Override
	public void turn() {
		System.out.println("He can't turn");	
	}

	@Override
	public void showLevelMessage() {
		System.out.println("He is at AdvancedLevel");
	}

	

}
