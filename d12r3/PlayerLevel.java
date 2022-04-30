package r2;

public interface PlayerLevel {
	
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();
	
	//자료를 보면 go(int)로 표기됨 -> player와 연동?
	//jump();  int 를 여기에서 사용 for문을 이용하면됨 
	//showLevelMessage(); 여기서 레벨을 보여주는게 아님
	default void go(int count) { 
		run();
		for(int i = 0; i<count; i++) {
			jump();
		}
		turn();
	}
	
}
