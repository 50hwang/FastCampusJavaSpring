package ch03.sec10;

public abstract class Car {

	/* methods */
	
	//추상 메소드
	public abstract void drive();
	public abstract void stop();
	
	//구상 메소드
	public void engineStart() {
		System.out.println("시동을 켭니다.");
	}
	
	public void engineStop() {
		System.out.println("시동을 끕니다.");
	}
	
	//후크 메소드 : 비어있는 구상 메소드 -> 특정 하위 클래스의 필요에 따라서만 재정의 
	public void wash() {}
	
	//템플릿 메소드 - 흐름 선언. final 선언을 통해, 하위 클래스에서 메소드 오버라이딩 저지
	final public void run() {
		engineStart();
		drive();
		stop();
		wash();
		engineStop();
	}
	
}
