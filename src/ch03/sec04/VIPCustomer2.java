package ch03.sec04;

class VIPCustomer2 extends Customer2 {

	/* Fields */
	double discountRatio;
	private String agentID;

	/* Constructors */
	public VIPCustomer2() { // 기본 생성자

		super(0, "no-name"); // 상위 클래스의 기본 생성자가 없기 때문에, 상위의 사용자 정의 생성자를 명시해준다.

		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;
	}

	public VIPCustomer2(int customerID, String customerName) {	//사용자 정의 생성자

		super(customerID, customerName); // 마찬가지로 상위 클래스에 존재하는 생성자를 받아와준다.

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

	@Override	//애노테이션 : 컴파일러에게 특별한 정보(재정의된 메서드) 제공 -> 컴파일 오류를 줄여준다. 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * discountRatio);
		return price;
	}

	
	
}
