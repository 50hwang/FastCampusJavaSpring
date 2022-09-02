package ch03.sec03;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		/* VIP °í°´ »ý¼º */
		VIPCustomer2 customerKim = new VIPCustomer2();
		
		customerKim.setCustomerName("±èÀ¯½Å");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer2 customerKang = new VIPCustomer2(10030, "°­°¨Âù");
		customerKang.bonusPoint = 25000;
		System.out.println(customerKang.showCustomerInfo());
		
	}

}
