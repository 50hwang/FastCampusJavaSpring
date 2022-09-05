package ch03.sec06;
import java.util.ArrayList;

public class CustomerTest3 {

	public static void main(String[] args) {
		
		/* ArrayList를 통한 고객 생성 */
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
		
		/* 각 멤버 정보 출력 */
		for(Customer3 customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("\n==============================\n");
		
		/* 똑같이 10000원 결제할 때 각 멤버별 결제액 및 보너스 포인트 */
		int price = 10000;
		for(Customer3 customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerGrade() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
			
		}
	}

}
