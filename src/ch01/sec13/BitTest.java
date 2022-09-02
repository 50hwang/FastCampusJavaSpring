package ch01.sec13;
/*
 * ch01.sec13. 자바의 연산자들 -3 (조건 연산자, 비트 연산자)
 */


public class BitTest {
	/*
	 * 비트연산자
	 * 2진수의 비트 단위의 0과 1 사이의 논리연산 및 배치 처리
	 * OR(|) : 둘 중 하나라도 1이면 1
	 * AND(&) : 둘 다 1이어야만 1
	 * XOR(^) : 둘이 다르면 1
	 * NOT(~) : 2의 보수 처리
	 * 	-> 2의 보수 처리 : 0 <-> 1 반전 후 1을 더한 값
	 * 	-> 8비트 2진수의 양수 음수 개념을 좀 더 공부해보자
	 * << : 왼쪽 shift 후 0으로 채워짐
	 * >> : 오른쪽 shift 후 부호에 따라 0 또는 1로 채워짐
	 * >>> : 오른쪽 shift 후 무조건 0으로 채워짐
	 * 	-> shift 연산도 좀 더 공부해보자
	 */

	public static void main(String[] args) {

		int num1 = 5;	// 이진수로 00000101
		int num2 = 10;	// 이진수로 00001010
		int num3 = -25;
		System.out.println(num3);
		
		System.out.println(num1 | num2);	//OR		00001111
		System.out.println(num1 & num2);	//AND		00000000
		System.out.println(num1 ^ num2);	//XOR		00001111
		System.out.println(~num1);			//NOT		11111011
		
		System.out.println("");
		
		System.out.println(num1 << 2);		//2비트 좌로			00010100
		System.out.println(num1);			//값 자체가 변하지 않음	00000101 그대로
		System.out.println(num1 <<= 2);		//값을 바꾸고 싶은 경우	00010100로 변함
		System.out.println(num1);			//값 자체를 바꾼 결과		00010100

	}

}
