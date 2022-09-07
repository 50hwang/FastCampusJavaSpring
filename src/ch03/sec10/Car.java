package ch03.sec10;

public abstract class Car {

	/* methods */
	
	//�߻� �޼ҵ�
	public abstract void drive();
	public abstract void stop();
	
	//���� �޼ҵ�
	public void engineStart() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void engineStop() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//��ũ �޼ҵ� : ����ִ� ���� �޼ҵ� -> Ư�� ���� Ŭ������ �ʿ信 ���󼭸� ������ 
	public void wash() {}
	
	//���ø� �޼ҵ� - �帧 ����. final ������ ����, ���� Ŭ�������� �޼ҵ� �������̵� ����
	final public void run() {
		engineStart();
		drive();
		stop();
		wash();
		engineStop();
	}
	
}
