package ch03.sec08;

class Customer3 {

	/* Fields */
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	
	/* Constructors */
	public Customer3(int customerID, String customerName) {	//�⺻ �����ڸ� ���� ����� ���� ������
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}

	/* Methods */
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int calcPrice(int price) {	//���� �Է� ��, ���� ��ȯ�� ���ÿ� �⺻ ���ʽ� ����Ʈ ����
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {	//�� ����(���, ���ʽ� ����Ʈ) ���
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
}
