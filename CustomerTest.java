package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
	
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerB = new Customer(10020, "Beak");
		Customer customerJ = new GoldCustomer(10030, "Jung");
		Customer customerK = new GoldCustomer(10040, "Kim");
		Customer customerL = new VIPcustomer(10050, "Lee");
		
		customerList.add(customerB);
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerK);
		customerList.add(customerL);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 포인트는 " + customer.bonusPoint + "입니다." );
		}
		
	}
}
