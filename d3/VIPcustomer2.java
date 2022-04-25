package ch03;

public class VIPcustomer extends Customer{
		
		String agentId;
		double saleRatio;
		
//		public VIPcustomer() {
////			super(0, "no-name");
//			bonusRatio = 0.05;
//			saleRatio = 0.1;
//			customerGrade = "VIP";
//			
//			System.out.println("VIPcustomer() call");
//		}
		
		public VIPcustomer(int customerId, String customerName) {
			super(customerId, customerName);
			
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
			
			System.out.println("VIPcustomer(int, String) call");
		}

		public String getAgentId() {
			return agentId;
		}
		
}
