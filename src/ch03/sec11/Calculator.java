package ch03.sec11;

public abstract class Calculator implements Calc {	//인터페이스를 상속받을 경우 extends가 아닌 implements를 쓴다.
	
	/* methods */
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	//아직 구현하지 않은 추상 메소드 times, divide가 있으므로, 여전히 추상 클래스다.
	
}
