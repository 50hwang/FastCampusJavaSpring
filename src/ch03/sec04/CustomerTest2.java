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
		
		Customer2 vc = new VIPCustomer2(12345, "noname");	//업 캐스팅과 메소드 오버라이딩
		price = vc.calcPrice(1000);	//가상 메소드 : 실제 생성된 인스턴스(VIPCustomer2)의 메소드로 호출이 되었다.	
		System.out.println(vc.showCustomerInfo() + price + "원 결제");

		
	}

}
