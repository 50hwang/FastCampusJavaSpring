package ch03.sec04;

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
	}

	public VIPCustomer2(int customerID, String customerName) {	//����� ���� ������

		super(customerID, customerName); // ���������� ���� Ŭ������ �����ϴ� �����ڸ� �޾ƿ��ش�.

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

	@Override	//�ֳ����̼� : �����Ϸ����� Ư���� ����(�����ǵ� �޼���) ���� -> ������ ������ �ٿ��ش�. 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * discountRatio);
		return price;
	}

	
	
}
