package ch03.sec10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� �Ǽ��� ��� �����մϴ�.");
		System.out.println("����� �ڵ��� �����ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("����� �극��ũ�� ��� ����ϴ�.");
	}

}
