package ch02;

public class VIPcustomer extends Customer{
		String agentId;
		double saleRatio;
		
		public VIPcustomer() {
			bonusRatio = 0.05;
			saleRatio = 0.1;
			customerGrade = "VIP";
		}

		public String getAgentId() {
			return agentId;
		}
		
}
