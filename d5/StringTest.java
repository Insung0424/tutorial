package ch03;

public class StringTest {

	public static void main(String[] args) {
			String java = new String ("java");
			String android = new String("android");
			
			System.out.println(System.identityHashCode(java)); // 918221580
			// 기존 java의 값은 방치되서 불필요한 메모리가 쌓이게됨
			java = java.concat(android);
			
			System.out.println(java);
			
			System.out.println(System.identityHashCode(java)); // 2055281021
	}

}
