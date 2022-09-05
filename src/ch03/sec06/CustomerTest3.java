package ch03.sec06;
import java.util.ArrayList;

public class CustomerTest3 {

	public static void main(String[] args) {
		
		/* ArrayList�� ���� �� ���� */
		ArrayList<Customer3> customerList = new ArrayList<>();
		
		Customer3 customerT = new Customer3(10010, "Thomas");
		Customer3 customerJ = new Customer3(10020, "James");
		Customer3 customerE = new GoldCustomer3(10030, "Edward");
		Customer3 customerP = new GoldCustomer3(10040, "Percy");
		Customer3 customerK = new VIPCustomer3(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		/* �� ��� ���� ��� */
		for(Customer3 customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("\n==============================\n");
		
		/* �Ȱ��� 10000�� ������ �� �� ����� ������ �� ���ʽ� ����Ʈ */
		int price = 10000;
		for(Customer3 customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerGrade() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
			
		}
	}

}
