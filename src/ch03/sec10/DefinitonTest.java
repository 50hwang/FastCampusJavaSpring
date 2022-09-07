package ch03.sec10;

public class DefinitonTest {

	public static void main(String[] args) {
		
		/* Definition 클래스로부터 직접 static final 상수 호출 */
		
		System.out.println(Definition.GREETING);
		System.out.println(Definition.MIN);
		System.out.println(Definition.MAX);
		System.out.println(Definition.MATH_CODE);
		System.out.println(Definition.CHEM_CODE);
		System.out.println("원주율은 " + Definition.PI + "입니다.");

	}

}
