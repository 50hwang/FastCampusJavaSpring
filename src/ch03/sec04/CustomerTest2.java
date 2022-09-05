package ch03.sec04;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		/* VIP 고객 생성 */
		VIPCustomer2 customerKim = new VIPCustomer2();
		
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer2 customerKang = new VIPCustomer2(10030, "강감찬");
		customerKang.bonusPoint = 25000;
		System.out.println(customerKang.showCustomerInfo());
		
		/* 업 캐스팅 */
		Customer2 vc = new VIPCustomer2(00000, "no-name");
		
	}

}
