package ch20;

public class ArrayTest {

	public static void main(String[] args) {
			int arr[] = new int[10];
			int total = 0;
			
			for (int i = 0, num=1; i<10; i++) {
				arr[i] = num++;
			}
			for (int num : arr ) {
				total += num;
			}
//			System.out.println(total); 
			
			double arr1[] = new double[5];
			int count = 0;
			arr1[0] = 1.1; count++;
			arr1[1] = 2.1; count++;
			arr1[2] = 3.1; count++;
			
			double mtotal = 1;
			for (int i = 0; i<count;i++) {
				mtotal *= arr1[i];
			}
//			System.out.println(mtotal); count를 추가 하지 않으면 다른배열의 0도 곱해서 합이 0이됨.
			
			char [] alphabets = new char[26];
			char ch = 'A';
			
			for (int i = 0; i<alphabets.length; i++) {
				alphabets[i] = ch++;
			}
			
			for (char alpha : alphabets) {
				System.out.println(alpha + "," + (int)alpha);
			}
	
	}		
}
