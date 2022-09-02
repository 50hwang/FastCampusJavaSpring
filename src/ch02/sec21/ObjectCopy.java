package ch02.sec21;
/*
 * ch02.sec21. 객체 배열 사용하기
 * 3. 얕은 복사(Shallow copy)
 */


public class ObjectCopy {

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

		/*.arraycopy를 통한 객체 복사*/
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*객체 사본 확인*/
		System.out.println("\n=====copy library=====\n");
		for(Book book : copyLibrary) {
			book.showBookInfo();
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
