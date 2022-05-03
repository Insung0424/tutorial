package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] numbers = {10,55,23,2,79,101,16,82,30,45};//배열
		
		int min = numbers[0]; //최솟값
		int max = numbers[0]; //최댓값
		
		int minpos = 0;  //최솟값의 위치
		int maxpos = 0;  //최댓값의 위치
		//반복문 한번 사용, 몇번째인지 파악 
		// 최소,최대값을 0번째로 지정했으므로 순서는 1번부터 시작함
		// index는 0부터 시작하지만 일반적 인식은 순서를 셀때 1부터이므로
		// 위치값에 +1을 해줘야함
		//최소 최대 각각 if 문을 사용함 else if 를 사용하면 
		//첫번째에서 만족시 두번째를 확인 할 수 없음
		for(int i = 1; i<numbers.length;i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minpos = i+1;
			}
			if(max < numbers[i]) {
				max = numbers[i];
				maxpos = i+1;
			}
		}
		//최소와 최대 출력하기
		System.out.println(max + " " + maxpos);
		System.out.println(min + " " + minpos);
		
			
	}

}
