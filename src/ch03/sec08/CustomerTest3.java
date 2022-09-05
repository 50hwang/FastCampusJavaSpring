package ch03.sec08;
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
		
		/* 다운 캐스팅 */
		if (customerE instanceof GoldCustomer3) {	//instanceof : customerE 객체가 GoldCustomer3 타입인지 클래스 타입 체크 
			GoldCustomer3 gc = (GoldCustomer3)customerE;	//맞을 경우에 한해서 customerE를 goldCustomer3 타입의 변수로 다운캐스팅
			System.out.println(customerE.showCustomerInfo());
		}
		
		}
	}

