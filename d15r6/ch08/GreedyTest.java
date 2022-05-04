package ch08;

public class GreedyTest {

	public static void main(String[] args) {

		int[] coins = {500, 100, 50, 10};
		int price = 2160; //목표
		int count; //필요갯수

		for(int i=0; i<coins.length; i++) {
			count = 0;
			count += price/coins[i];  //갯수 계산
			price = price % coins[i];  //위의 계산후 남은 금액 만들기

			System.out.println(coins[i] + " " + count);
		}

	}
}
