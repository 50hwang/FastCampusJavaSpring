package ch03.sec09;

public class Desktop extends Computer{
	
	// �߻� �޼ҵ�� ������ �ʼ�
	@Override
	void display() {
		System.out.println("����ũž �����.");
	}

	@Override
	void typing() {
		System.out.println("����ũž Ű����.");
	}

	// ���� �޼ҵ嵵 ������ ����
	@Override
	public void turnOn() {
		System.out.println("����ũž �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("����ũž ���ϴ�.");
	}
	
}
