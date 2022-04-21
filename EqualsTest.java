package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
			
			Student std1 = new Student(100, "Lee");
			Student std2 = new Student(100, "Lee");
			Student std3 = std1;
			
			System.out.println(std1 == std2);  // false		
			System.out.println(std1.equals(std2));   // false  equals를 오버라이딩 한이후는 true
			System.out.println(std1.hashCode());  //100
			System.out.println(std2.hashCode());  //100
			System.out.println(std1 == std3);   //true
			
//			String str1 = new String("abc");
//			String str2 = new String("abc");
//			
//			System.out.println(str1.equals(str2));
//			System.out.println(str1.hashCode());  //96354
//			System.out.println(str1.hashCode());  //96354
//			
//			Integer i = 100;
//			System.out.println(i.hashCode()); // 100
			
			System.out.println(System.identityHashCode(std1)); //진짜hash 2055281021
			System.out.println(System.identityHashCode(std2)); //진짜hash 1554547125
			System.out.println(System.identityHashCode(std3)); //진짜hash 2055281021
			
			std1.setStudentName("Kim");
			Student copyStudent = (Student)std1.clone();
			System.out.println(copyStudent); // 100,Kim 
			// 새롭게 생성이 아니라 상태를 복사하는 것
	}

}
