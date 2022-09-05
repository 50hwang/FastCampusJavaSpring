package ch03.sec06;

public class GoldCustomer3 extends Customer3{

	/* Fields */
	double discountRatio;	//������ �������� �߰�
	
	/* Constructors */
	public GoldCustomer3(int customerID, String customerName) {
		super(customerID, customerName);
		
		discountRatio = 0.1;
		bonusRatio = 0.02;	//������ ������ ����
	}
	
	/* Methods */
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * discountRatio);
		return price;
	}
	
}
