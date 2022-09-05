package ch03.sec08;
import java.util.ArrayList;

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
		
		AnimalTest test = new AnimalTest();	//�ٿ� ĳ���� �׽�Ʈ �޼ҵ� ������ ���� ���� ��ü ����
		
		/* ArrayList�� ���� �� �������� ���� �׽�Ʈ */
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		System.out.println("\n==============================\n");
		
		/* �ٿ� ĳ���� �׽�Ʈ */
		test.testDownCasting(animalList);
		
	}
	
	/* �ٿ� ĳ���� �޼ҵ� */
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.read();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.build();
			} else {
				System.out.println("unsupported type");
			}
		}
	}
	
}
