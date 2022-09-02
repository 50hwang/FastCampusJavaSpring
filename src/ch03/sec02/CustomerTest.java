package ch03.sec02;

public class CustomerTest {

	public static void main(String[] args) {
		
		/* 老馆 绊按 积己 */
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("捞鉴脚");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		/* VIP 绊按 积己 */
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerName("辫蜡脚");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
