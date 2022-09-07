package ch03.sec10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 악셀을 밟아 주행합니다.");
		System.out.println("사람이 핸들을 돌립니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아 멈춥니다.");
	}

}
