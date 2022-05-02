package p2;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.Play(1);
		
		ADPlayer aLevel = new ADPlayer();
		player.UpgradeLevel(aLevel);
		player.Play(2);
		
		SPlayer sLevel = new SPlayer();
		player.UpgradeLevel(sLevel);
		player.Play(3);
		
	}

}
