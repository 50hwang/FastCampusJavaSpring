package ch01.sec16;
/*
 * ch01.sec16. 조건이 여러 개 일 때 간단히 표현되는 switch-case문
 */

import java.util.Scanner;	//사용자 입력 모듈 가져오기

public class SwitchCaseTest2 {
	/*
	 * 비교 조건이 특정 값이나 문자열일 경우에 사용
	 * 	-> if-else, if-else 투성이의 번거로운 부분을 가독성 좋게 구현
	 * 	-> 특정 조건(case) 만족 시 break;문으로 조건문을 빠져나감
	 */

	public static void main(String[] args) {

		/*
		 * 입력 문자열에 따른 획득 메달을 출력하는 프로그램.
		 */
		
		System.out.println("어떤 메달을 획득하셨습니까?? (Gold / Silver / Bronze)");
		Scanner scanner = new Scanner(System.in);	//사용자 입력 받는 기능 구현
		String medal = scanner.next();				//입력된 문자열을 medal에 선언

		switch(medal) {		//예의주시할 조건 문자열 값 : medal
		
			case "Gold":	//medal 문자열 값이 Gold일 때 실행
				System.out.println("금메달 입니다.");
				break;
			case "Silver":	//medal 문자열 값이 Silver일 때 실행
				System.out.println("은메달 입니다.");
				break;
			case "Bronze":	//medal 문자열 값이 Bronze일 때 실행
				System.out.println("동메달 입니다.");
				break;
			default:		//위 조건들의 어느 경우에도 해당하지 않을 때 디폴트로써 실행
				System.out.println("메달이 없습니다.");
				break;		//조건문을 빠져나감.
				
		}
		
		scanner.close();	//사용자 입력 모듈 닫기.
		
	}

}
