package ch01.sec10;
/*
 * ch01.sec10. 변하지 않는 상수와 리터럴, 변수의 형 변환
 */

public class TypeConversion {
	/*
	 * 원하는 다른 타입으로 형 변환할 땐, (대상타입)변수명/상수명을 쓰면 된다.
	 */

	public static void main(String[] args) {

		double dNum = 1.2;	//double형 실수 선언
		float fNum = 0.9f;	//float형 실수 선언
		
		int iNum1 = (int)dNum + (int)fNum;	//각각 int로 타입캐스팅 후 합산
		int iNum2 = (int)(dNum + fNum);		//실수 합산 후 int로 타입캐스팅
		
		System.out.println(iNum1);	//각각 실수의 소숫점 이하를 버리고 합산
		System.out.println(iNum2);	//합산한 결과값 실수의 소숫점 이하를 버림
		
	}

}
