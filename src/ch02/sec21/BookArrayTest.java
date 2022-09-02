package ch02.sec21;
/*
 * ch02.sec21. 객체 배열 사용하기
 * 2. 선언된 객체 Book의 배열(library[]) 생성 및 확인 테스트
 */

public class BookArrayTest {

	public static void main(String[] args) {
		
		/*Book 클래스 배열로 library 생성*/
		Book[] library = new Book[5];
		
		/*Book 생성자를 이용한 각 객체들을 배열의 요소로 선언*/
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);		//생성된 객체 배열 요소 확인
			library[i].showBookInfo();			//각 객체의 showBookInfo() 메소드로 책 정보 확인 
		}
	}

}

