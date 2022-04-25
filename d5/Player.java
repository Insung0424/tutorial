package ch16;

public class Player{
		
		private PlayerLevel level;
		
		public Player() {
			level = new BeginnerLevel();
			level.showLevelMessage();
		}

		public PlayerLevel getLevel() {
			return level;
		}
		
		public void upgradeLevel(PlayerLevel level) {
			this.level = level;
			level.showLevelMessage();
		}
		
		public void play(int num) {
			level.go(num);
			System.out.println("====================");
		}

		
}
