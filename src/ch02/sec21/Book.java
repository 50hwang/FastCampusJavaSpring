package ch02.sec21;
/*
 * ch02.sec21. 객체 배열 사용하기
 * 1. 객체 Book 선언
 */

public class Book {
	
	/* 책의 속성(데이터) 설정*/
	private String title;
	private String author;
	
	/* 책 기본생성자*/
	public Book() {}
	
	/* 책 생성자*/
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	/*Book의 title get/set 메소드*/
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
		
	}

	/*Book의 author get/set 메소드*/
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	/*생성된 책의 정보 출력*/
	public void showBookInfo() {
		System.out.println(title + ", " + author);
	}
}
