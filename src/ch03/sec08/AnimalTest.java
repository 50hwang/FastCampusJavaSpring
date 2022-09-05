package ch03.sec08;
import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 날개짓을 하며 납니다.");
	}
	
	public void build() {
		System.out.println("독수리가 둥지를 짓습니다.");
	}
	
}

/* 테스트 코드 */
public class AnimalTest {


	/* 메인 메소드 */
	public static void main(String[] args) {
		
		/* 업 캐스팅을 통한 동물 소환 */
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();	//다운 캐스팅 테스트 메소드 실행을 위한 메인 객체 생성
		
		/* ArrayList를 통한 각 동물들의 동작 테스트 */
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		System.out.println("\n==============================\n");
		
		/* 다운 캐스팅 테스트 */
		test.testDownCasting(animalList);
		
	}
	
	/* 다운 캐스팅 메소드 */
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
