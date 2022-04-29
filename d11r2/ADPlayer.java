package r2;

public class ADPlayer implements PlayerLevel{

	@Override
	public void run() {
		System.out.println("can run");
	}

	@Override
	public void jump() {
		System.out.println("can jump");
	}

	@Override
	public void turn() {
		System.out.println("can't turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("I'm AD level");		
	}

}
