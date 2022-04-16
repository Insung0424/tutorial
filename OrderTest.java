package ch08;

public class OrderTest {

	public static void main(String[] args) {
			Order order1 = new Order();
			order1.orderNumber = "202204160003";
			order1.orderPhone = "01012345678";
			order1.address = "제주시 ";
			order1.date = 20220416;
			order1.hour = 163022;
			order1.price = 25000;
			order1.orderMenuNumber = 0002;
			
			order1.showOrderInfo();
			
	}

}
