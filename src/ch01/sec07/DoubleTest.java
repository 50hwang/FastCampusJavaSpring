package ch01.sec07;
/*
 * ch01.sec07. 실수는 어떻게 표현하나요?
 */

public class DoubleTest {
	/*
	 * 부동 소수점 방식의 실수 자료 표현
	 *	 float형과 double형이 있다.
	 *	 double형이 float형보다 더 많이 표현할 수 있다.
	 *	 float의 경우, 값 뒤에 "f" 리터럴을 표기한다.
	 */

	public static void main(String[] args) {
		double dNum = 3.14;		//double의 경우, 별도의 리터럴이 필요없다.
		float fNum = 3.14f;		//float의 경우, 값 뒤에 "f" 리터럴을 표기한다.
		
		System.out.println(dNum);
		System.out.println(fNum);

	}

}
