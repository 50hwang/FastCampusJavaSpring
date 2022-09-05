ch03 객체 지향 핵심

# ch03.sec08 다운 캐스팅과 `instance of`

    업캐스팅 된 클래스의 다시 원래의 하위 클래스 타입으로의 형 변환(다운 캐스팅)은 명시적으로 해야 한다.

## 다운 캐스팅(downcasting)

- 업캐스팅 된 클래스를 다시 원래의 하위 클래스의 타입으로 형 변환
- 하위 클래스의 형 변환은 명시적으로 해야 하는데, 이 때도 문제가 있다.
    - 다운캐스팅할 하위 클래스 타입이 안 맞을 경우 `ClassCastException` 발생

> 이전 sec06에서 사용한 고객 관리 클래스(CustomerTest3)에서 참고

```
Customer vc = new VIPCustomer();	//묵시적
VIPCustomer vCustomer = (VIPCustomer)vc;	//명시적 But 클래스 형 변환 런타임 예외가 발생하여 프로그램이 뻗을 위험성이 있다.
```

## instanceof를 이용한 인스턴스의 타입 체크

    객체의 클래스 타입 체크(맞으면 true, 틀리면 false)를 통하여, 좀 더 안전한 다운캐스팅을 구현할 수 있다.
    

> 이전 sec06에서 사용한 동물 클래스(AnimalTest)에서 참고

