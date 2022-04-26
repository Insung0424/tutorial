package ch10;

public class PassWordException extends Exception{
//												어떤 예외를 사용할지 모를 때는 Exception 사용
		public PassWordException(String message) {
			super(message);
		}
}
