package ch01.sec15;
/*
 * ch01.sec15. 조건이 여러 개일 때의 if문
 */

import java.util.Scanner;	//사용자 입력 모듈 가져오기

public class IfIfTest {
	/*
	 * if와 if를 사용하면, 각각 다른 조건문으로 해석되어 각각 수행하게 된다.
	 * 	-> 이 경우, 각각의 조건은 상호배타적이지 않은 독립 개별적이다.
	 */

	public static void main(String[] args) {

		/*
		 * 나이에 따른 구분 및 요금을 출력하는 프로그램의 변형 테스트
		 * 	-> IfElseIfElse테스트의 else if를 전부 if로 바꾸었다.
		 */
		
		Scanner scanner = new Scanner(System.in);	//사용자 입력 받는 기능 구현
		int age = scanner.nextInt();				//나이를 입력받은 값으로 선언
		int charge;									//요금을 정수로 선언
		
		if( age < 8 ) {								//만약 8살 미만이...??(조건1)
			charge = 1000;								//맞으면 실행.
			System.out.println("미취학아동 입니다.");
		} if( age < 14 ) {							//별개로, 만약 14살 미만이...??(조건2)
			charge = 2000;								//맞으면 실행.
			System.out.println("초등학생 입니다.");
		} if( age < 20 ) {							//또한 별개로, 20살 미만이...??(조건3)
			charge = 2500;								//맞으면 실행.
			System.out.println("중, 고등학생 입니다.");
		} else {										//조건 3이 아니면 실행.(조건1, 2는 아니면 그냥 아무것도 안 함.)
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");	//나이 정수값에 대해 해당되는 마지막 조건에 따른 요금 출력
		
		scanner.close();	//사용자 입력 모듈 닫기.

	}

}
