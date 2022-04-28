package review01;

public class Order {

		int orderNumber;
		String phoneNumber;
		String address;
		String orderDate;
		int orderHour;
		int orderPrice;
		String priceNumber;
		
		Order(){}
		
		Order(int orderNumber, String phoneNumber, String address, String orderDate, int orderHour,
				 int orderPrice, String priceNumber){
			this.orderNumber = orderNumber;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.orderDate = orderDate;
			this.orderHour = orderHour;
			this.orderPrice = orderPrice;
			this.priceNumber = priceNumber;
		}
		
		public void showInfo() {
			System.out.println(orderNumber);
			System.out.println(phoneNumber);
			System.out.println(address);
			System.out.println(orderDate);
			System.out.println(orderHour);
			System.out.println(orderPrice);
			System.out.println(priceNumber);
			
		}
		
}
