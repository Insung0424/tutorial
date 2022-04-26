package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
			int[] arr = {1,2,3,4,5};
			
			for (int num : arr) {
				System.out.println(num);
			}
			System.out.println();
			
			IntStream is = Arrays.stream(arr);
			is.forEach(n->System.out.println(n));
//			is.forEach(n->System.out.println(n)); stream은 한번 사용하면 다시 만들어야함
// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed			
	}

}
