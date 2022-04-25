package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	public InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	private class InClass {
		
		int iNum = 100;
		
		void InTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.InTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void InTest() {
			System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
				System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
			}
		}
	}

public class InnerTest {

	public static void main(String[] args) {
			
//			OutClass outClass = new OutClass();
//			outClass.usingClass();
//			System.out.println("====================================");
//			OutClass.InClass inner = outClass.new InClass();
//			inner.InTest(); //private 이므로 외부에서 사용안됨
		
			OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
			sInClass.InTest();
			
			System.out.println("====================================");
			
			OutClass.InStaticClass.sTest();
	}

}
