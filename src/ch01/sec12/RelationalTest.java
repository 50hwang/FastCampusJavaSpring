package ch01.sec12;
/*
 * ch01.sec12. 자바의 연산자들 -2 (관계, 논리 연산자)
 */

public class RelationalTest {
	/*
	 * 관계 연산자(부등호, 등호, 상이 등...)
	 * 	관계 연산자의 결과값은 boolean(true, false) 형태이다.
	 * 	조건문 또는 반복문의 조건식으로 많이 사용된다.
	 */

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 3;

		boolean value = (num1 > num2);	//두 정수값의 대소비교 결과
		System.out.println(num1 + " > " + num2 + " : " + value);

		System.out.println("");

		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));

	}

}
