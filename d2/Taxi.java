package ch15;

public class Taxi {
		String TaxiName;
		int money;
		
		public Taxi(String Taxiname) {
			this.TaxiName = Taxiname;
		}
		
		public void take(int money) {
			this.money += money;
		}
		
		public void showTaxiInfo() {
			System.out.println(TaxiName + "의 수입은 " + money + "입니다.");
		}
}
