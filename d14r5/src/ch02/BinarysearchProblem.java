package ch02;

public class BinarysearchProblem {

	public static void main(String[] args) {
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108}; //배열
		
		int target = 12;  //찾는 수
		int left = 0;  // 왼쪽 끝값
		int right = numbers.length -1; //오른쪽 끝값 index의 마지막은 크기의 -1
		
		int mid = (left + right)/2;  //중간값
		
		int temp = numbers[mid];  //비교하기위한 위치
		
		boolean find = false; // 멤버변수로 사용시 기본은 false
		
		while(left<=right) { //양끝값이 같다는 것은 더이상 비교할 인자가 없다
			if(target == temp) { 
				find = true;
				break;
			}
			else if(target < temp) {
				right = mid -1;
			}
			else {
				left = mid +1;
			}
			//위치 재정립
			mid = (left+right)/2;
			temp = numbers[mid];
		}
		if(find == true) {
			mid++; //일반적으로 생각하는 위치이므로 +1해줌
			System.out.println(mid);
		}
		else {
			System.out.println("none");
		}


	}

}
