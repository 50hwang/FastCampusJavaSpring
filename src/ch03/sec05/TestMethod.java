package ch03.sec05;

public class TestMethod {
	
	/* fields */
	int num;	//Ŭ������ ���� : �ν��Ͻ� ������, �� ������ ���� �ε�ȴ�.	
	
	/* constructors */
	public TestMethod() {}	//�ν��Ͻ� ���� : ������ �� �ν��Ͻ��� ���� �ּҰ� ���� ������ �ε�ȴ�.
	
	/* methods */
	void aaa() {	//�޼ҵ� : �� �ν��Ͻ����� ���������� ��ɾ�set�� ����� �� �ֵ���, �޸��� �޼ҵ� ������ �� ���� �ε�ȴ�.
		System.out.println("aaa() ȣ��");
	}

	public static void main(String[] args) {	//main()�Լ��� ���� ���� args�� ���� �޸𸮿� �ε�ȴ�.
		
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();

	}

}
