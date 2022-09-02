package ch02.sec20;
/*
 * ch02.sec20. 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열(Array)
 * 2. 향상된 for 반복문을 활용한 문자 배열 처리
 */

public class CharArrayTest {
	
	public static void main(String[] args) {
	
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for(char alpha : alphabets) {	//배열의 n개 요소를 0 ~ (n-1)까지 순차적으로 순회할 경우의 간단한 for문
			System.out.println(alpha +", "+ (int)alpha);
		}
		
	}
}