package ch03.sec02;

class VIPCustomer extends Customer {

	/* Fields */
	double discountRatio;
	private String agentID;

	/* Constructors */
	public VIPCustomer() { // 기본 생성자

		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;
	}

	/* Methods */
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
