package ch08;

public class Order {
		public String orderNumber;
		public String orderPhone;
		public String address;
		public int date;
		public int hour;
		public int price;
		public int orderMenuNumber;
		
		public void showOrderInfo() {
			System.out.println("주문 접수 번호 : " + orderNumber);
			System.out.println("주문 핸드폰 번호 : " + orderPhone);
			System.out.println("주문 집 주소 : " + address);
			System.out.println("주문 날짜 : " + date);
			System.out.println("주문 시간 : " + hour);
			System.out.println("주문 가격 : " + price);
			System.out.println("메뉴 번호 : " + orderMenuNumber);
		}
		
}
