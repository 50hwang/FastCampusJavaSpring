package ch03.sec06;

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
		
		/* 각 동물들의 동작 테스트 */
		AnimalTest test = new AnimalTest();	//moveAnimal() 메소드 실행을 위한 테스트 객체 생성
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
	}
	
	/* 각 동물의 객체를 받아 해당 객체의 move 메소드 호출하는 테스트 메소드 */
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
