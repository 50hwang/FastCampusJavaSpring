package ch03.sec03;

public class CustomerTest {

	public static void main(String[] args) {
		
		/* VIP �� ���� */
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
