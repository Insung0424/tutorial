package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void Sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void Buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

//	@Override
//	public void order() {
//		ch15.Buy.super.order();
//	}
		
	public void hello() {
		System.out.println("hello");
	}
}
