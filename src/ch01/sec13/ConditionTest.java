package ch01.sec13;
/*
 * ch01.sec13. 자바의 연산자들 -3 (조건 연산자, 비트 연산자)
 */

import java.util.Scanner;

public class ConditionTest {
	/*
	 * 삼항 조건연산자 : 조건식의 결과가 true일 때와 false일 때에 따른 다른 결과 수행. 
	 * if 조건문의 간결화 (조건식) ? x : y; 	// 참일 때 x 도출, 거짓일 때 y 도출.
	 */

	public static void main(String[] args) {

		int max; // 조건(대소비교)에 따른 결과값 선언

		System.out.println("입력 받은 두 수 중 큰 수를 출력하세요.\n");
		Scanner scanner = new Scanner(System.in); // 사용자 입력 클래스 구현

		System.out.println("입력1 : ");
		int x = scanner.nextInt(); // 정수형 변수 x에 사용자 입력 받기

		System.out.println("입력2 : ");
		int y = scanner.nextInt(); // 정수형 변수 y에 사용자 입력 받기

		max = (x > y) ? x : y; // (x > y)가 맞으면 x를, 아니면 y를 선택
		System.out.println(max);
	}

}
