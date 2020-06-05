package demoCalculator;

public class Calculator {
    void handleAdd(int a, int b) {  // method sai kieu du lieu function
    	return a + b;
    }
    void handleMinus(int a, int b) { // method sai kieu du lieu function
    	return a - b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator c = new Calculator()
    c.handleAdd(10, 9);
     c.handleMinus(10, 9);
	}

}
