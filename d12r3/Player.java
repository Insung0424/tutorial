package r2;

public class Player {
	//player 는 한 개의 level 변수를 가지고 이는 Playerlevel형이다
	//외부에서 접근불가한 변수 선언 위와 연계됨
	private PlayerLevel level;
	//플레이어 생성자
	//위에서 선언된 변수를 이용
	//기본 플레이어 생성
	//메세지
	public Player() {
		level = new BPlayer();
		level.showLevelMessage();
	}
	//getlevel
	public PlayerLevel getLevel() {
		return level;
	}
	//UpgradeLevel
	//내가 만들어야하는 변수아님
	//변수를 이용
	//업캐스팅의 개념? 자체적으로 올라가는 방법은 모름
	//메인에서 하위를 생성한뒤 메서드(변수)를 이용해서 변환해주는 방식
	// ADPlayer aLevel = new ADPlayer();
	// player.UpgradeLevel(aLevel);
	//메세지
	public void UpgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	//횟수이므로 int
	 // player 생성자를 확인하면 player의 
	//go 메서드를 누가 쓸수있는지 알 수 있다.
	public void Play(int s) {
		level.go(s);
	}
}
