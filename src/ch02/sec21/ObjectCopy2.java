package ch02.sec21;
/*
 * ch02.sec21. 객체 배열 사용하기
 * 4. 깊은 복사(Deep copy)
 */


public class ObjectCopy2 {

	public static void main(String[] args) {
		/*빈 배열 생성*/
		Book[] library = new Book[5];		//원본 객체 배열
		Book[] copyLibrary = new Book[5];	//사본 객체 배열
		
		/*Book 생성자로 원본 객체 배열 library 선언*/
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		/*Book 기본생성자로 사본 객체 배열 copyLibrary 선언*/
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		/*get메소드를 통한 원본 데이터로, set메소드를 통한 사본 삽입*/
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		/*원본 객체 수정 후 원본 및 사본 비교*/
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");

		/*객체 원본 확인*/
		System.out.println("\n====== libray =========\n");
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println(library[0]);		//생성된 객체 배열 요소 확인
		System.out.println(library[1]);		//생성된 객체 배열 요소 확인
		System.out.println(library[2]);		//생성된 객체 배열 요소 확인
		System.out.println(library[3]);		//생성된 객체 배열 요소 확인
		System.out.println(library[4]);		//생성된 객체 배열 요소 확인

		
		/*객체 사본 확인*/
		System.out.println("\n=====copy library=====\n");
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		System.out.println(copyLibrary[0]);		//생성된 객체 배열 요소 확인
		System.out.println(copyLibrary[1]);		//생성된 객체 배열 요소 확인
		System.out.println(copyLibrary[2]);		//생성된 객체 배열 요소 확인
		System.out.println(copyLibrary[3]);		//생성된 객체 배열 요소 확인
		System.out.println(copyLibrary[4]);		//생성된 객체 배열 요소 확인

		
	}	
}
