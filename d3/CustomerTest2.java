package ch03;

public class CustomerTest {

	public static void main(String[] args) {
			Customer customerLee = new Customer(10010, "홍길동");
//			customerLee.setCustomerName("홍길동");
//			customerLee.setCustomerId(10010);
			customerLee.bonusPoint = 1000;
			
			System.out.println(customerLee.showCustomerInfo());
			
			VIPcustomer customerKim = new VIPcustomer(10020, "김허");
//			customerKim.setCustomerName("김허");
//			customerKim.setCustomerId(10020);
			customerKim.bonusPoint = 10000;
			System.out.println(customerKim.showCustomerInfo());
			
//			Customer vc = new VIPcustomer(21324, "none");
//			VIP로 만들었지만 타입은 Customer
	}

}
