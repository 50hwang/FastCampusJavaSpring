package ch03.sec03;

class VIPCustomer extends Customer {

	/* Fields */
	double discountRatio;
	private String agentID;

	/* Constructors */
	public VIPCustomer() { // �⺻ ������

		//super(); <- �����Ϸ����� �ڵ������� ���� Ŭ������ �⺻ �����ڸ� �־��ش�.
		
		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;
		
		System.out.println("VIPCustomer() ȣ���");
	}

	/* Methods */
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
