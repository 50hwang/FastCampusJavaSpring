package ch03.sec09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer dt = new Desktop();
		dt.display();
		dt.typing();
		dt.turnOn();
		dt.turnOff();

		System.out.println();
		
		Notebook myNb = new MyNotebook();
		myNb.display();
		myNb.typing();
		myNb.turnOn();
		myNb.turnOff();

	}

}
