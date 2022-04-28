package review01;

public class Taxi {
	
		int TaxiNumber;
		int money;
		int count;
		
		public Taxi(int TaxiNumber) {
			this.TaxiNumber = TaxiNumber;
		}
		
		public void take(int money) {
			this.money += money;
			count++;
		}

		@Override
		public String toString() {
			return TaxiNumber +"'s income is " + money;
		}
		
		
}
