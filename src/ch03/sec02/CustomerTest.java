package ch03.sec02;

public class CustomerTest {

	public static void main(String[] args) {
		
		/* �Ϲ� �� ���� */
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		/* VIP �� ���� */
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
