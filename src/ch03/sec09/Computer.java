package ch03.sec09;

public abstract class Computer {

	/* methods */
	
	// �߻� �޼ҵ�(abstract method) -> �� ���� Ŭ�������� �ٸ��� ������ ������ ���
	abstract void display();
	abstract void typing();
	
	// ���� �޼ҵ�(concrete method) -> ��� ���� Ŭ�������� �������� ������ ���
	public void turnOn() {
		System.out.println("��ǻ�͸� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("��ǻ�͸� ���ϴ�.");
	}
	
}
