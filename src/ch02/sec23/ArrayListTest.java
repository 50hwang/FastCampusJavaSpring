package ch02.sec23;
/*
 * ch02.sec23. 객체 배열을 구현한 클래스 ArrayList
 * 1. 객체 배열 클래스인 ArrayList의 구현 및 주요 메소드 활용
 */

import java.util.ArrayList;	//ArrayList를 사용하기 위한 패키지 필요
import ch02.sec21.Book;		//이전에 구현한 타 패키지의 객체 Book 가져오기 

public class ArrayListTest {

	public static void main(String[] args) {
		
		/*ArrayList<배열할 객체명> 기본생성자*/
		ArrayList<Book>	library = new ArrayList<Book>();
		
		/*ArrayList에 객체 추가 메서드*/
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));

		/*.get(i)로 ArrayList library의 i번째 요소 값 추출*/
		for(int i = 0; i < library.size(); i++) {	//.size()로 ArrayList의 요소 갯수 추출
			System.out.println(library.get(i));			//i번째 요소 객체의 메모리 주소값
			library.get(i).showBookInfo();				//i번째 요소 객체 내 메소드 호출
		}
	}

}
