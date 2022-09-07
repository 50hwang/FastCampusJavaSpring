package ch03.sec09;

public class Desktop extends Computer{
	
	// 추상 메소드는 재정의 필수
	@Override
	void display() {
		System.out.println("데스크탑 모니터.");
	}

	@Override
	void typing() {
		System.out.println("데스크탑 키보드.");
	}

	// 구상 메소드도 재정의 선택
	@Override
	public void turnOn() {
		System.out.println("데스크탑 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("데스크탑 끕니다.");
	}
	
}
