package ch02.sec20;
/*
 * ch02.sec20. 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열(Array)
 * 1. 배열의 선언 및 초기화
 */

public class ArrayTest {

	public static void main(String[] args) {
		
		//기본적인 배일 선언 문법
		
		int[] arr1 = new int[10];		//1. 빈 배열 선언 1 : 특정 자료형의 배열로써 int[] 선언 -> 배열의 크기(10) 사전 확보
		int arr2[] = new int[10];		//2. 빈 배열 선언 2 : 해당 변수가 배열임을 지정하는 배열명[](arr2[]) 선언 -> 배열의 크기(10) 사전 확보
		
		
		int[] numbers1 = new int[] {10, 20, 30};	//3. 배열 선언과 동시에 초기화 1 : 생성자 new int[] 중괄호{} 안에 요소 할당
		int[] numbers2 = {10, 20, 30};				//4. 배열 선언과 동시에 초기화 2 : 생성자 new 생략 가능

		for(int i : arr1) {
			System.out.println(i);
		}

		System.out.println();
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
		System.out.println();

		
		for(int i : numbers1) {
			System.out.println(i);
		}

		System.out.println();
		
		for(int i : numbers2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		
		int[] ids;						//5. 선언해놓고 나중에 초기화 : 생성자 new int[] 생략 불가
		ids = new int[] {10, 20, 30};		//생성자 new int[] 쓰고, 요소 할당 -> 이 때 크기 사전 지정 안 한다.
		
		for(int i : ids) {
			System.out.println(i);
		}

		System.out.println();
		
		
		//배열의 활용
		
		int arr[] = new int[10];	//6. 인덱스 연산자 [] 활용 : 배열 요소가 저장된 메모리 위치를 연산하여 찾아 줌.
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];	//total = total + arr[i]
		}
		
		System.out.println(total);

		System.out.println();


		//배열의 길이(.length)와 요소의 개수
		
		double[] dArr = new double[5];
		int count = 0;
		
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double mTotal = 1;

		for(int i = 0; i < dArr.length; i++) {	//배열의 길이(.length)로 처리할 경우.
			mTotal *= dArr[i];
		}
		System.out.println(mTotal);
		
		System.out.println();

		
		mTotal = 1.0;
		
		for(int i = 0; i < count; i++) {		//요소의 개수에 대한 변수(count)로 유지하는 경우.
			mTotal *= dArr[i];
		}
		
		System.out.println(mTotal);
	
		System.out.println();


	}
}
