package ch03.sec11;

public interface Calc {

	/* fields */
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	/* methods */
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
