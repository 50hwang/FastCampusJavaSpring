ch03 객체 지향 핵심

# ch03.sec06 다형성과 다형성을 사용하는 이유

    다형성을 잘 활용하면, 유연하고 확장성 있고 유지보수가 편리한 프로그램을 만들 수 있다.

## 다형성이란?

> 하나의 코드가 여러 자료형으로 구현되어 실행되는 것.
>    - 같은 코드에서 여러 다른 실행 결과가 나온다.
>    - 정보 은닉, 상속과 더불어 OOP의 가장 큰 특징이다.

## 다형성의 예

> 모든 동물은 움직인다.
>
> 동물 중에는 사람, 호랑이, 독수리가 있다.
>
> 움직일 때, 사람은 두 발로 걷고, 호랑이는 네 발로 걸으며, 독수리는 날개짓을 한다.
>
> 움직일 때와는 별개로, 사람은 책을 읽고, 호랑이는 사냥을 하며, 독수리는 둥지를 짓는다.

- 예제 코드의 기본 틀

```
class Animal {...}

class Human extends Animal {...}

class Tiger extends Animal {...}

class Eagle extends Animal {...}

public class AnimalTest {

	public void moveAnimal(Animal animal) {...}

   public static void main(String[] args) {...}
}
```

- 예제 테스트 코드(AnimalTest.java)

```
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
```

- 출력 메소드 코드는 `animal.move();` 한 줄인데, 어떤 인스턴스형(각 다른 동물들)이 들어가냐에 따라, `move()`의 implementation(구현)이 달라진다.
    - 이것이 다형성이다.
 
## 다형성을 사용하는 이유

> 여러 하위 클래스들을 하나의 타입(상위 클래스) 만으로 핸들링할 수 있다.

- 상위 클래스에서는 공통적인 부분을 제공, 하위 클래스에서는 각 클래스에 맞는 기능을 구현한다.
    - 다른 하위 객체들을 추가해서 함께 관리할 경우, 똑같이 extends를 해서 추가할 수 있다.

- 이처럼, 상속과 메소드 오버라이딩을 통하여 확장성 있는 프로그램을 만들 수 있다.
     - 이러한 기능을 쓰지 않으면, 각 객체 경우마다 수많은 if-else 문이 구현되어, 코드의 유지 보수가 어려워진다.
     
- 단, 하위 객체들의 업 캐스팅으로 인해 각 하위 클래스들이 상위 클래스로부터 타이트한 영향을 받는다.
     - 각 하위 클래스마다의 고유한 로직을 호출할 수 없다. -> 다시 다운 캐스팅 필요
     - 예제 코드에서, 각 동물 하위 클래스의 고유 메소드(`read()`, `hunt()`, `build()`)는 접근 불가로 구현할 수 없다.
 
    ArrayList를 통하여 각 동물 객체들을 추가하여, 추가된 동물들의 move()를 일괄 호출하는 코드를 작성해보자.
 
```
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
```

## 다형성을 활용한 멤버십 프로그램 확장

    고객이 늘어, 일반 고객보다는 많이 구매하고, VIP보다는 적게 구매하는 고객에게도 혜택을 주기로 했다.
    GOLD 고객 등급을 만들고 혜택을 아래와 같이 주기로 한다.
     1. 제품을 살 때 10% 할인해준다.
     2. 보너스 포인트는 2% 적립해준다.

> 기존의 `Sec04`에서 다루었던 `Customer2`, `VIPCustomer2`, `CustomerTest2`를 3로 이름 변경, 가져와, 새로운 고객 계층인 `GoldCustomer3`를 만들어, 고객 객체들의 임의 생성 및 동작 테스트를 해보기로 하자.
 
> 아래와 같은 결과가 출력되도록 코드를 구현해보자.

```
Thomas님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
James님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
Edward님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
Percy님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
Kim님의 등급은 VIP이며, 보너스 포인트는 0입니다.

==============================

Thomas님이 10000원 지불하셨습니다.
SILVER님의 현재 보너스 포인트는 100입니다.
James님이 10000원 지불하셨습니다.
SILVER님의 현재 보너스 포인트는 100입니다.
Edward님이 9000원 지불하셨습니다.
SILVER님의 현재 보너스 포인트는 200입니다.
Percy님이 9000원 지불하셨습니다.
SILVER님의 현재 보너스 포인트는 200입니다.
Kim님이 9000원 지불하셨습니다.
VIP님의 현재 보너스 포인트는 500입니다.

```