package ch01.sec14;
/*
 * ch01.sec14. 조건문 - if문 (만약 ...라면)
 */

import java.util.Scanner;	//사용자 입력 모듈 가져오기

public class IfElseTest {
	/*
	 * if( 조건식 ) { 수행문(들)1; } else { 수행문(들)2; };
	 * 조건식의 조건이 참이면 수행문(들)1만 수행, 거짓이면 수행문(들)2만 수행.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	//사용자 입력 받는 기능 구현
		int age = scanner.nextInt();				//입력받은 값 정수로 age 선언
		
		if( age >= 8 ) {							//만약 age >= 0이...??
			System.out.println("학교에 다닙니다.");		//맞으면, 실행할 것
		} else {
			System.out.println("학교에 다니지 않습니다.");	//아니면, 실행할 것
		}
		
		scanner.close();							//사용자 입력 모듈 닫기
		
	}

}
