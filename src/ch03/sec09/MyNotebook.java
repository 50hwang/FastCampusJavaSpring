package ch03.sec09;

public class MyNotebook extends Notebook{
	
	// 남은 추상 메소드 재정의 -> 추상으로 남겨둔 메소드가 없을 시 비로소 구상 클래스 가능
	@Override
	void display() {
		System.out.println("내 노트북의 내장 모니터.");
	}
	
}
