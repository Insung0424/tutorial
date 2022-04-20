package ch10;

public class AlCar extends Car{

	@Override
	public void drive() {
			System.out.println("자율주행을 합니다.");
			System.out.print("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("비가 와서 와이퍼를 작동합니다.");
	}
		
}
