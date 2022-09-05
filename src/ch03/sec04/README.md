ch03 ��ü ���� �ٽ�

# ch03.sec04 �żҵ� �������ϱ�(Overriding)

    �������̵� : ���� Ŭ������ ���ǵ� �޼ҵ��� ���� ������ ���� Ŭ�������� ������ ����� ���� �ʴ� ���,
             ���� Ŭ�������� ���� �̸��� �޼ҵ带 �������� �� �ִ�!!(��, �ż��� �����)

## ���� Ŭ�������� �޼ҵ� �������ϱ�

> ch02.sec03�� Customer2, VIPCustomer2, CustomerTest2 Ŭ������ �������̵� �ڵ� �߰�, �׽�Ʈ �ڵ� ����

- Customer2�� calcPrice() �������� �������̸鼭, VIPCustomer2�� calcPrice()���� �������� �����ؼ� ����ϰ� �ϵ��� �Ϸ��� -> �������Ͽ� �����ؾ� �Ѵ�.
 
- Customer2 ���� calcPrice() �޼ҵ�

```
	public int calcPrice(int price) {	//���� �Է� ��, ���� ��ȯ�� ���ÿ� �⺻ ���ʽ� ����Ʈ ����
		bonusPoint += price * bonusRatio;
		return price;
```
 
- �����ǵ� VIPCustomer2 calcPrice() �޼ҵ�

```
	@Override	//�ֳ����̼� : �����Ϸ����� Ư���� ����(�����ǵ� �޼���) ���� -> ������ ������ �ٿ��ش�. 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * discountRatio);
		return price;
	}
```

- �ֳ����̼�(Annotation) : ���� �ּ��̶�� �ǹ�
    - �����Ϸ����� Ư���� ���� ����
    - `@Overriding` �ֳ����̼��� �����ǵ� �޼ҵ��� �ǹ̷� ����ΰ� ������ �޼ҵ�� �ٸ� ���, �������̵� ������ �� �ǹǷ� ������ ����.
 
## �� ��ȯ�� �������̵� �޼ҵ� ȣ��

> `Customer2 vc = new VIPCustomer2();`
> vc�� ���� Ÿ���� Customer2, ������ �ν��Ͻ� Ÿ���� VIPCustomer2
> ����޼ҵ� ���� -> �ڹٿ����� �׻� �ν��Ͻ� �޼ҵ尡 ȣ��ȴ�.
>     * �ڹ��� ��� �޼ҵ�� ���� �޼ҵ��.
 
 