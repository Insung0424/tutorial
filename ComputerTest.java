package ch09;

public class ComputerTest {

	public static void main(String[] args) {
//			추상클래스는 상속만을 하기 위해 만든개념
		Computer desktop = new DeskTop();
		desktop.display();
//		Computer computer = new Computer(); Computer 내부에 구현부가 없으므로 사용안됨
	}

}
