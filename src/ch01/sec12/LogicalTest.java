package ch01.sec12;
/*
 * ch01.sec12. 자바의 연산자들 -2 (관계, 논리 연산자)
 */

public class LogicalTest {
	/*
	 * 논리연산자(논리합, 논리곱, 부정) 
	 * 	논리곱 && : AND 
	 * 	논리합 || : OR 
	 * 	부정 ! : NOT
	 */

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag; // 논리 연산 결과값 선언

		flag = (num1 > 0) && (num2 > 0); // 참 AND 참 = 참
		System.out.println(flag);

		System.out.println("");

		flag = (num1 < 0) && (num2 > 0); // 거짓 AND 참 = 거짓
		System.out.println(flag);

		System.out.println("");

		flag = (num1 > 0) || (num2 > 0); // 참 OR 참 = 참
		System.out.println(flag);

		System.out.println("");

		flag = (num1 < 0) || (num2 > 0); // 거짓 OR 참 = 참
		System.out.println(flag);

		System.out.println("");

		flag = !(num1 > 0); // NOT 참 = 거짓
		System.out.println(flag);

	}

}
