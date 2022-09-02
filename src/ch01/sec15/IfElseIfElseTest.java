package ch01.sec15;
/*
 * ch01.sec15. 조건이 여러 개일 때의 if문
 */

import java.util.Scanner;	//사용자 입력 모듈 가져오기

public class IfElseIfElseTest {
	/*
	 * 하나의 상황에 대한 조건이 여러개로 나뉘고, 각 조건에 다른 수행이 이루어져야 할 경우 사용.
	 * 	-> 각 조건은 상호 배타적. 즉, 중첩되지 않는다.
	 * 	-> if 어느 한 쪽의 조건이 true일 경우, 나머지 else if 부분은 수행되지 않는다.
	 */

	public static void main(String[] args) {

		/*
		 * 나이에 따른 구분 및 요금을 출력하는 프로그램
		 */
		
		Scanner scanner = new Scanner(System.in);	//사용자 입력 받는 기능 구현
		int age = scanner.nextInt();				//나이를 입력받은 값으로 선언
		int charge;									//요금을 정수로 선언
		
		if( age < 8 ) {								//만약 8살 미만이...??(우선1 조건)
			charge = 1000;								//맞으면 실행.
			System.out.println("미취학아동 입니다.");
		} else if( age < 14 ) {							//...아닌데, 14살 미만이...??(우선2 조건)
			charge = 2000;									//맞으면 실행.
			System.out.println("초등학생 입니다.");
		} else if( age < 20 ) {								//...역시 아닌데, 20살 미만이...??(우선 3조건)
			charge = 2500;										//맞으면 실행.
			System.out.println("중, 고등학생 입니다.");
		} else {													//...이마저도 아닌 모든 나머지 경우에 실행.(조건 해당사항 전무)
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");	//나이 정수값 조건에 따른 요금 출력
		
		scanner.close();	//사용자 입력 모듈 닫기.

	}

}
