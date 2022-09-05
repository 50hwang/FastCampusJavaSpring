ch03 객체 지향 핵심

# ch03.sec04 매소드 재정의하기(Overriding)

    오버라이딩 : 상위 클래스에 정의된 메소드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우,
             하위 클래스에서 같은 이름의 메소드를 재정의할 수 있다!!(즉, 매서드 엎어쓰기)

## 하위 클래스에서 메소드 재정의하기

> ch02.sec03의 Customer2, VIPCustomer2, CustomerTest2 클래스에 오버라이딩 코드 추가, 테스트 코드 수정

- Customer2의 calcPrice() 할인율을 미적용이면서, VIPCustomer2의 calcPrice()에는 할인율을 적용해서 계산하게 하도록 하려면 -> 재정의하여 구현해야 한다.
 
- Customer2 기존 calcPrice() 메소드

```
	public int calcPrice(int price) {	//가격 입력 시, 가격 반환과 동시에 기본 보너스 포인트 산출
		bonusPoint += price * bonusRatio;
		return price;
```
 
- 재정의된 VIPCustomer2 calcPrice() 메소드

```
	@Override	//애노테이션 : 컴파일러에게 특별한 정보(재정의된 메서드) 제공 -> 컴파일 오류를 줄여준다. 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * discountRatio);
		return price;
	}
```

- 애노테이션(Annotation) : 원래 주석이라는 의미
    - 컴파일러에게 특별한 정보 제공
    - `@Overriding` 애노테이션은 재정의된 메소드라는 의미로 선언부가 기존의 메소드와 다를 경우, 오버라이딩 성립이 안 되므로 에러가 난다.
 
## 형 변환과 오버라이딩 메소드 호출

> `Customer2 vc = new VIPCustomer2();`
> vc의 변수 타입은 Customer2, 생성된 인스턴스 타입은 VIPCustomer2
> 가상메소드 원리 -> 자바에서는 항상 인스턴스 메소드가 호출된다.
>     * 자바의 모든 메소드는 가상 메소드다.
 
 