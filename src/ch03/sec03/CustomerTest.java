package ch03.sec03;

public class CustomerTest {

	public static void main(String[] args) {
		
		/* VIP °í°´ »ý¼º */
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerName("±èÀ¯½Å");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
