package ch03.sec03;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		/* VIP �� ���� */
		VIPCustomer2 customerKim = new VIPCustomer2();
		
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer2 customerKang = new VIPCustomer2(10030, "������");
		customerKang.bonusPoint = 25000;
		System.out.println(customerKang.showCustomerInfo());
		
	}

}
