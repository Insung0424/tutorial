package ch03;
@FunctionalInterface 
//함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하면 에러남
public interface MyNumber {
	int getMax(int num1, int num2);
}
