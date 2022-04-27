package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

			Coffee ethiCoffee = new EthiopiaAmericano();
			ethiCoffee.brewing();
			
			System.out.println();
			Coffee ethiLatte= new Latte(ethiCoffee);
			ethiLatte.brewing();
			
			System.out.println();
			Coffee ethiMocha = new Mocha(new Latte(new EthiopiaAmericano()));
			ethiMocha.brewing();
			
			System.out.println();
			Coffee keyacoffee = new WhippingCream(new Mocha(new KeyaAmericano()));
			keyacoffee.brewing();																	
	}

}
