package ch03.sec10;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
	@Override
	public void wash() {
		System.out.println("������ �ڵ� �����մϴ�.");
	}

}
