package ch03.sec11;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();	//타입 상속 : CompleteCalc 객체는 Calc 인터페이스의 타입을 내포한다.
		
		int num1 = 10;
		int num2 = 20;
		
		//Calculator 추상 클래스의 일부 구현된 구상 메소드로부터 사용
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
		
		//CompleteCalc 구상 클래스의 구상 메소드로부터 사용
		System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));
		
		//calc.showInfo();는 상속해준 Calc 타입에서는 정의되지 않은 메소드이므로 접근할 수 없다.
		//calc.showInfo();를 사용하고 싶을 경우, 타입 선언을 CompleteCalc로 해주어야 한다.

	}

}
