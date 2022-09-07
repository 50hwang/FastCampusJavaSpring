package ch03.sec10;

public class CarTest {

	public static void main(String[] args) {

		/* 템플릿 메소드 코드 한 줄로, 정해진 흐름에 따라 프로그램 동작 */

		Car ac = new AICar();
		ac.run();

		System.out.println("\n=====================\n");

		Car mc = new ManualCar();
		mc.run();

	}

}
