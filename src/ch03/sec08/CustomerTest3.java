package ch03.sec08;
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
		
		/* �ٿ� ĳ���� */
		if (customerE instanceof GoldCustomer3) {	//instanceof : customerE ��ü�� GoldCustomer3 Ÿ������ Ŭ���� Ÿ�� üũ 
			GoldCustomer3 gc = (GoldCustomer3)customerE;	//���� ��쿡 ���ؼ� customerE�� goldCustomer3 Ÿ���� ������ �ٿ�ĳ����
			System.out.println(customerE.showCustomerInfo());
		}
		
		}
	}

