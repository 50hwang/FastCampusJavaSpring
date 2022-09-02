package ch01.sec08;
/*
 * ch01.sec08. 문자는 프로그램에서 어떻게 표현하여 사용하나요?
 */

public class CharacterTest {
	/*
	 * 문자형과 문자열의 표현
	 * 	char 자료형은 단일문자 또는 그에 해당하는 정수값을 표현한다.
	 *  char 형태의 출력은 단일문자로 출력한다.
	 *  기본적인 영문자 및 숫자는 ASCII정수값에 매칭한다.
	 *  그 외의 언어는 unicode(UTF-16)를 사용하며, /u 뒤의 16진수 4자리를 사용한다.
	 *  	UTF-16은 2바이트로(=16진수 4자리) 문자를 표현한다.
	 */
	
	public static void main(String[] args) {
		
		char ch1 = 'A';					//단일문자 자료형 char에 A 선언
		System.out.println(ch1);		//단일문자 그대로 출력
		System.out.println((int)ch1);	//단일문자에 해당하는 정수형으로 타입 변환 후 출력

		System.out.println();
		
		char ch2 = 66;				//단일문자 자료형 char에 ASCII정수값으로 선언
		System.out.println(ch2);	//char 자료형에는 정수로 입력해도 해당 문자형으로 출력

		System.out.println();

		int ch3 = 67;					//ASCII정수값을 우선 int로 선언
		System.out.println(ch3);		//int값 그대로 출력
		System.out.println((char)ch3);	//ASCII정수값에 해당하는 문자형으로 타입 변환 후 출력
		
		//char ch4 = -66;	//단일문자 자료형 ASCII 정수값에 음수는 대입이 불가능하다.
		System.out.println();

		char ch5 = '한';				//유니코드 문자형 '한' 선언
		char ch6 = '\uD55C';		//유니코드 문자형 '한'에 해당하는 16진수 선언 -> 이 때 escape문자 "역슬래쉬 u" 선제시 필요
		System.out.println(ch5);	
		System.out.println(ch6);	
		
	}

}
