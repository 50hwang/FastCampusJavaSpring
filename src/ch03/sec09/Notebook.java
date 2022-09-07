package ch03.sec09;

public abstract class Notebook extends Computer{
	
	// 추상 메소드 일부만 재정의 -> 하위 역시 여전히 추상 클래스
	@Override
	void typing() {
		System.out.println("노트북 내장 키보드.");
	}
	
}
