package ch01.sec12;
/*
 * ch01.sec12. 자바의 연산자들 -2 (관계, 논리 연산자)
 */

public class ShortCircuit {
	/*
	 * 단락 회로 평가 - 논리 연산에서 (굳이) 모든 항이 실행되지 않는 경우
	 * 	앞의 항의 결과가 false이면, 논리곱 &&은 무조건 false
	 * 	앞의 항의 결과가 true이면, 논리합 ||은 무조건 true
	 */

	public static void main(String[] args) {
		
		int num1 = 10;	//기준 논리 연산
		int i = 2;		//부가적인 논리 연산
		boolean value;	//논리값 선언
		
		//앞의 항 (num1 = num1 + 10) < 10) 즉, 결과값이 false인 경우를 생각해보자
		
		value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10);	//앞의 결과가 false이므로, 뒤의 결과는 더이상 평가하지 않음.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		System.out.println("");
		
		value = ( (num1 = num1 + 10) < 10) || ( (i = i + 2) < 10);	//앞의 결과는 false이나, 뒤의 결과는 계속해서 평가함. 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
