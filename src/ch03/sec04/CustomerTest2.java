package ch03.sec04;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		/* VIP �� ���� */
		Customer2 customerLee = new Customer2(10010, "�̼���");
		customerLee.bonusPoint = 1000;

		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price + "�� ����");
		
		
		VIPCustomer2 customerKim = new VIPCustomer2();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;

		price = customerKim.calcPrice(1000);	//�����ǵ� �޼ҵ� �׽�Ʈ
		System.out.println(customerKim.showCustomerInfo() + price + "�� ����");
		
	}

}
