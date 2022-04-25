package ch15;

public class CustomerTest {

	public static void main(String[] args) {
			
		Customer customer = new Customer();
		customer.Buy();
		customer.Sell();
		customer.hello();
		customer.order();
		
		Buy buyer = customer;
		buyer.Buy();
		buyer.order();
		
		Sell seller = customer;
		seller.Sell();
		seller.order();
	}

}
