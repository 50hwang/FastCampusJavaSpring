package ch03.sec04;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		/* VIP 고객 생성 */
		Customer2 customerLee = new Customer2(10010, "이순신");
		customerLee.bonusPoint = 1000;

		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price + "원 결제");
		
		
		VIPCustomer2 customerKim = new VIPCustomer2();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;

		price = customerKim.calcPrice(1000);	//재정의된 메소드 테스트
		System.out.println(customerKim.showCustomerInfo() + price + "원 결제");
		
	}

}
