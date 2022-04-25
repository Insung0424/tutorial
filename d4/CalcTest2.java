package ch14;

public class CalcTest {

	public static void main(String[] args) {
		
			int num1 = 10;
			int num2 = 2;
			
			Calc test = new CompleteCalc();
//		내용물                     겉부분?
			System.out.println(test.add(num1, num2));
			System.out.println(test.substract(num1, num2));
			System.out.println(test.times(num1, num2));
			System.out.println(test.divide(num1, num2));
			
			test.description();
			
			int[] arr = {1,2,3,4,5};
			System.out.println(Calc.total(arr));
		
	}

}
