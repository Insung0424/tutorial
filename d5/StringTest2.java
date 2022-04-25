package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
			Class c = Class.forName("java.lang.String"); // String 을 string 으로 소문자로 쓰면 오류발생
			
//			Constructor [] cons = c.getConstructors();
//			for (Constructor co : cons) {
//				System.out.println(co); // public java.lang.String 생성자 목록
//			}
			
			Method[] m = c.getMethods();
			for (Method mth : m) {
				System.out.println(mth);  // Method 생성자 목록
			}
			// 리플렉션 프로그램 
//			로컬에 오브젝트가 없을때 사용
	}

}
