package ch03.sec03;

class VIPCustomer2 extends Customer2 {

	/* Fields */
	double discountRatio;
	private String agentID;

	/* Constructors */
	public VIPCustomer2() { // �⺻ ������

		super(0, "no-name"); // ���� Ŭ������ �⺻ �����ڰ� ���� ������, ������ ����� ���� �����ڸ� ������ش�.

		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;

		System.out.println("VIPCustomer2() ȣ���");
	}

	public VIPCustomer2(int customerID, String customerName) {	//����� ���� ������

		super(customerID, customerName); // ���������� ���� Ŭ������ �����ϴ� �����ڸ� �޾ƿ��ش�.

		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;

		System.out.println("VIPCustomer2(int customerID, String customerName) ȣ���");
	}

	/* Methods */
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
