package ch03.sec11;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();	//Ÿ�� ��� : CompleteCalc ��ü�� Calc �������̽��� Ÿ���� �����Ѵ�.
		
		int num1 = 10;
		int num2 = 20;
		
		//Calculator �߻� Ŭ������ �Ϻ� ������ ���� �޼ҵ�κ��� ���
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
		
		//CompleteCalc ���� Ŭ������ ���� �޼ҵ�κ��� ���
		System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));
		
		//calc.showInfo();�� ������� Calc Ÿ�Կ����� ���ǵ��� ���� �޼ҵ��̹Ƿ� ������ �� ����.
		//calc.showInfo();�� ����ϰ� ���� ���, Ÿ�� ������ CompleteCalc�� ���־�� �Ѵ�.

	}

}
