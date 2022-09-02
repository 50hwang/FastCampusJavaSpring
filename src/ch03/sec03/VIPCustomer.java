package ch03.sec03;

class VIPCustomer extends Customer {

	/* Fields */
	double discountRatio;
	private String agentID;

	/* Constructors */
	public VIPCustomer() { // 기본 생성자

		//super(); <- 컴파일러에서 자동적으로 상위 클래스의 기본 생성자를 넣어준다.
		
		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;
		
		System.out.println("VIPCustomer() 호출됨");
	}

	/* Methods */
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
