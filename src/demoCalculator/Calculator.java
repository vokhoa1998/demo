package demoCalculator;

public class Calculator {
    int handleAdd(int a, int b) {  // da fix xong
    	return a + b;
    }
    int handleMinus(int a, int b) { // da fix xong
    	return a - b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator c = new Calculator();
     System.out.println("Tong:"+c.handleAdd(10, 9));
     System.out.println("Tong:"+c.handleMinus(10, 9));
     
	}

}
