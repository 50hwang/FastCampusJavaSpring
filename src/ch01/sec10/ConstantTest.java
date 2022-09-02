package ch01.sec10;
/*
 * ch01.sec10. 변하지 않는 상수와 리터럴, 변수의 형 변환
 */

public class ConstantTest {
	/*
	 * 상수의 경우, 고정값 선언 후 절대 다른 값으로 대입 불가
	 *  자료형 앞에 final 예약어 표기로 선언
	 *  네이밍 컨벤션 : All 대문자 + Snake Case
	 */
		
	public static void main(String[] args) {

		final int MAX_NUM = 100;	//정수형 상수 MAX_NUM 선언과 동시에 고정값 선언

		final int MIN_NUM;			//정수형 상수 MIN_NUM 선언
		MIN_NUM = 0;				//MIN_NUM의 고정값 0 선언
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;			//상수에 값을 바꾸어서 대입할 경우 에러 발생
		
	}

}
