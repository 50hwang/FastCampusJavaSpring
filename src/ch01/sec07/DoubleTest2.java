package ch01.sec07;
/*
 * ch01.sec07. 실수는 어떻게 표현하나요?
 */

public class DoubleTest2 {
	/*
	 * 부동 소수점 방식의 오류
	 * 	지수부 자체로 0을 표현할 수 없는 한계가 존재
	 */
	
	public static void main(String[] args) {
		
		double dNum = 0;				//double형 실수 초기값 0 선언
		
		for(int i = 0; i<10000; i++) {	//10000회 for 반복문 시작
			dNum = dNum + 0.1;				//dNum에 0.1 가산
		}								//반복문 종료
		
		System.out.println(dNum);

		/*
		 * 원래대로라면 1000이 나와야 할 것이다.
		 * 하지만 1000.0000000001588이라는 근소한 오차가 발생하였다.
		 */
	}

}
