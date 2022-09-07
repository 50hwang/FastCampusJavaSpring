package ch03.sec09;

public abstract class Computer {

	/* methods */
	
	// 추상 메소드(abstract method) -> 각 하위 클래스마다 다르게 구현할 예정인 기능
	abstract void display();
	abstract void typing();
	
	// 구상 메소드(concrete method) -> 모든 하위 클래스에서 공통으로 구현할 기능
	public void turnOn() {
		System.out.println("컴퓨터를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다.");
	}
	
}
