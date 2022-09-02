package ch02.sec22;
/*
 * ch02.sec22. 2차원 배열 사용하기(다차원)
 */

public class TwoDimensionTest {

	public static void main(String[] args) {

		/*2차원 배열 선언*/
		int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};	//1행에 {1, 2, 3}, 2행에 {3, 4, 5, 6}
		int i, j;									//인덱스 설정
		
		/*2차원 배열 확인*/
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println("row No. " + (i+1) + " total : " + arr[i].length + "\n");
		}

	}
}
