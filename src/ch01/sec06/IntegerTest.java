package ch01.sec06;
/*
 * ch01.sec06. 정수는 어떻게 표현하나요?
 */

public class IntegerTest {
	/*
	 * 변수 선언 시, 해당 자료형의 크기만큼 메모리 할당한다.
	 */

	public static void main(String[] args) {
		byte bs = 127;
		
		System.out.println(bs);
		
		//int iVal = 12345678900;	//int 자료형 할당 크기 초과
		//long lVal = 12345678900;	//long의 리터럴 미표기
		long lVal = 12345678900L;	//값 뒤에 리터럴 "L" 표기

	}

}
