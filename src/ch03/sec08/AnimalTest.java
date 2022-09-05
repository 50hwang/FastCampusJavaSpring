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
		
		/* ArrayList를 통한 각 동물들의 동작 테스트 */
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
	}
	
}
