package ch03.sec10;

public class CarTest {

	public static void main(String[] args) {

		/* ���ø� �޼ҵ� �ڵ� �� �ٷ�, ������ �帧�� ���� ���α׷� ���� */

		Car ac = new AICar();
		ac.run();

		System.out.println("\n=====================\n");

		Car mc = new ManualCar();
		mc.run();

	}

}
