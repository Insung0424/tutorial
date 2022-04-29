package r2;

public class Player {
	//private String level;
	private PlayerLevel level; //player 는 한 개의 level 변수를 가지고 이는 Playerlevel형이다
	
	public Player() {
		level = new BPlayer();
		level.showLevelMessage(); //레벨설명추가
	}

	public PlayerLevel getLevel() {
		return level;
	}
													//내가 만들어야하는 변수아님
	public void UpGradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage(); //레벨설명추가
	}
								//횟수이므로 int
	public void Play(int count) {
		level.go(count); // player 생성자를 확인하면 player의 
									//go 메서드를 누가 쓸수있는지 알 수 있다.
	}
	
}
