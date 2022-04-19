package ch04;

public class CustomerTest {

	public static void main(String[] args) {
			Customer customerLee = new Customer(10010, "홍길동");
//			customerLee.setCustomerName("홍길동");
//			customerLee.setCustomerId(10010);
			customerLee.bonusPoint = 1000;
			
			int price = customerLee.calcPrice(1000);
			
			System.out.println(customerLee.showCustomerInfo() + price);
			
			VIPcustomer customerKim = new VIPcustomer(10020, "김허");
//			customerKim.setCustomerName("김허");
//			customerKim.setCustomerId(10020);
			customerKim.bonusPoint = 10000;
			
			price = customerKim.calcPrice(1000);
			
			System.out.println(customerKim.showCustomerInfo() + price);
			
			Customer vc = new VIPcustomer(21324, "none");
			vc.calcPrice(1000);
			System.out.println(vc.showCustomerInfo() + price);
//			VIP로 만들었지만 타입은 Customer
//			가상메서드가 호출됨 900
	}

}
