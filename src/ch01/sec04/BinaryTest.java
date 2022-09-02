package ch01.sec04;
/*
 * ch01.sec04. 컴퓨터에서 자료 표현하기
 */

public class BinaryTest {
	/*
	 * 정수 10을 10진수, 2진수, 8진수, 16진수로 표현하기
	 */

	public static void main(String[] args) {

		
		int num = 10;		//10진수는 그냥 입력
		int bNum = 0B1010;	//2진수는 0B 쓰고 2진수 입력
		int oNum = 012;		//8진수는 0 쓰고 입력
		int xNum = 0XA;		//16진수는 0X 쓰고 16진수 입력
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);

		/*
		 * 출력은 동일한 값인 10진수 10이 나왔다. 
		 * 
		 * * Q. 다른 진수로 출력하려면 어떻게 해야 할까...??
		 * 
		 */
	}

}
