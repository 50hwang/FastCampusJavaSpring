package ch03.sec05;

public class TestMethod {
	
	/* fields */
	int num;	//클래스의 변수 : 인스턴스 생성시, 힙 영역에 따로 로드된다.	
	
	/* constructors */
	public TestMethod() {}	//인스턴스 생성 : 생성된 각 인스턴스의 참조 주소가 스택 영역에 로드된다.
	
	/* methods */
	void aaa() {	//메소드 : 각 인스턴스마다 공통적으로 명령어set을 사용할 수 있도록, 메모리의 메소드 영역에 한 번만 로드된다.
		System.out.println("aaa() 호출");
	}

	public static void main(String[] args) {	//main()함수의 지역 변수 args가 스택 메모리에 로드된다.
		
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();

	}

}
