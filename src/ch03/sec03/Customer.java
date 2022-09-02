package ch03.sec03;

class Customer {

	/* Fields */
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	
	/* Constructors */
	public Customer() {	//기본 생성자
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출됨");
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
	
	public int calcPrice(int price) {	//가격 입력 시, 가격 반환과 동시에 기본 보너스 포인트 산출
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {	//고객 정보(등급, 보너스 포인트) 출력
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
}
