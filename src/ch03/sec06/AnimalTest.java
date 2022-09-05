package ch03.sec06;

class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void read() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void hunt() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("�������� �������� �ϸ� ���ϴ�.");
	}
	
	public void build() {
		System.out.println("�������� ������ �����ϴ�.");
	}
	
}

/* �׽�Ʈ �ڵ� */
public class AnimalTest {


	/* ���� �޼ҵ� */
	public static void main(String[] args) {
		
		/* �� ĳ������ ���� ���� ��ȯ */
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/* �� �������� ���� �׽�Ʈ */
		AnimalTest test = new AnimalTest();	//moveAnimal() �޼ҵ� ������ ���� �׽�Ʈ ��ü ����
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
	}
	
	/* �� ������ ��ü�� �޾� �ش� ��ü�� move �޼ҵ� ȣ���ϴ� �׽�Ʈ �޼ҵ� */
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
