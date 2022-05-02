package p2;

public class Player {

		private PlayerLevel level;
		
		public Player() {
//생성자이므로 위의 인터페이스에서 생성된 level로 기본플레이어를 생성해야함
			level = new BPlayer();
			level.showLevelMessage();
		}

		public PlayerLevel getLevel() {
			return level;
		}
				
		public void Play(int i) {
//이 클래스에서 사용할 변수는 하나밖에 없음
			level.go(i);
		}

		public void UpgradeLevel(PlayerLevel level) {
			this.level = level;
			level.showLevelMessage();
		}
}
