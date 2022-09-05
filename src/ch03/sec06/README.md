ch03 ��ü ���� �ٽ�

# ch03.sec06 �������� �������� ����ϴ� ����

    �������� �� Ȱ���ϸ�, �����ϰ� Ȯ�强 �ְ� ���������� ���� ���α׷��� ���� �� �ִ�.

## �������̶�?

> �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��.
>    - ���� �ڵ忡�� ���� �ٸ� ���� ����� ���´�.
>    - ���� ����, ��Ӱ� ���Ҿ� OOP�� ���� ū Ư¡�̴�.

## �������� ��

> ��� ������ �����δ�.
>
> ���� �߿��� ���, ȣ����, �������� �ִ�.
>
> ������ ��, ����� �� �߷� �Ȱ�, ȣ���̴� �� �߷� ������, �������� �������� �Ѵ�.
>
> ������ ���ʹ� ������, ����� å�� �а�, ȣ���̴� ����� �ϸ�, �������� ������ ���´�.

- ���� �ڵ��� �⺻ Ʋ

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

- ���� �׽�Ʈ �ڵ�(AnimalTest.java)

```
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
```

- ��� �޼ҵ� �ڵ�� `animal.move();` �� ���ε�, � �ν��Ͻ���(�� �ٸ� ������)�� ���Ŀ� ����, `move()`�� implementation(����)�� �޶�����.
    - �̰��� �������̴�.
 
## �������� ����ϴ� ����

> ���� ���� Ŭ�������� �ϳ��� Ÿ��(���� Ŭ����) ������ �ڵ鸵�� �� �ִ�.

- ���� Ŭ���������� �������� �κ��� ����, ���� Ŭ���������� �� Ŭ������ �´� ����� �����Ѵ�.
    - �ٸ� ���� ��ü���� �߰��ؼ� �Բ� ������ ���, �Ȱ��� extends�� �ؼ� �߰��� �� �ִ�.

- ��ó��, ��Ӱ� �޼ҵ� �������̵��� ���Ͽ� Ȯ�强 �ִ� ���α׷��� ���� �� �ִ�.
     - �̷��� ����� ���� ������, �� ��ü ��츶�� ������ if-else ���� �����Ǿ�, �ڵ��� ���� ������ ���������.
     
- ��, ���� ��ü���� �� ĳ�������� ���� �� ���� Ŭ�������� ���� Ŭ�����κ��� Ÿ��Ʈ�� ������ �޴´�.
     - �� ���� Ŭ���������� ������ ������ ȣ���� �� ����. -> �ٽ� �ٿ� ĳ���� �ʿ�
     - ���� �ڵ忡��, �� ���� ���� Ŭ������ ���� �޼ҵ�(`read()`, `hunt()`, `build()`)�� ���� �Ұ��� ������ �� ����.
 
    ArrayList�� ���Ͽ� �� ���� ��ü���� �߰��Ͽ�, �߰��� �������� move()�� �ϰ� ȣ���ϴ� �ڵ带 �ۼ��غ���.
 
```
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
```