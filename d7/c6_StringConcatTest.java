package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "world!";
		
		
//		StringConcatImplements strimpl = new StringConcatImplements();
//		strimpl.makeString("Hello", "world!");
		
		StringConcat concat = (s, v)->System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		//StringConcat concat = (s, v)->System.out.println(s + "," + v); 
		//람다식으로 실행하면 발생하는 작업
		//익명클래스로 아래와 같이 실행됨
		//=============================================
//		StringConcat concat2 = new StringConcat() {
//			@Override
//			public void makeString(String s1, String s2) {
//				System.out.println(s1 + "," + s2);
//			}
//		};
		//=============================================
	}

}
