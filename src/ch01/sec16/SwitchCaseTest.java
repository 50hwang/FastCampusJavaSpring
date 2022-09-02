package ch01.sec16;
/*
 * ch01.sec16. 조건이 여러 개 일 때 간단히 표현되는 switch-case문
 */

import java.util.Scanner;	//사용자 입력 모듈 가져오기

public class SwitchCaseTest {
	/*
	 * 비교 조건이 특정 값이나 문자열일 경우에 사용
	 * 	-> if-else, if-else 투성이의 번거로운 부분을 가독성 좋게 구현
	 * 	-> 특정 조건(case) 만족 시 break;문으로 조건문을 빠져나감
	 */

	public static void main(String[] args) {
		
		/*
		 * 달력에서 월에 따른 최대 일 수 출력하는 프로그램.
		 * 	-> 여기서, 윤달의 경우는 생략.
		 */

		Scanner scanner = new Scanner(System.in);	//사용자 입력 받는 기능 구현
		int month = scanner.nextInt();				//특정 월을 입력받은 값으로 선언
		int day;									//해당 월의 최대 일 수을 정수로 선언

		switch(month) {		//예의주시할 조건 값 : month
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:	//month값이 1, 3, 5, 7, 8, 10, 12(월)인 경우 실행
				day = 31;
				break;		//조건문을 빠져나감.
			case 4: case 6: case 9: case 11:							//month값이 4, 6, 9, 11(월)인 경우 실행
				day = 30;
				break;		//조건문을 빠져나감.
			case 2:														//month값이 2인 경우 실행
				day = 28;
				break;		//조건문을 빠져나감.
			default:													//위 조건들의 어느 경우에도 해당하지 않을 때 디폴트로써 실행
				day = 0;
				System.out.println("존재하지 않는 달입니다.");

		}
		
		System.out.println(month + "월은 " + day + "일이 최대입니다.");	//입력받은 월의 최대 일 수 출력
		
		scanner.close();	//사용자 입력 모듈 닫기.
		
	}

}
