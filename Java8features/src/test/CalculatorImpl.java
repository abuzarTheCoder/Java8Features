package test;

interface Calculator {
	//void switchOn(); 
	void sum(int input);
}

public class CalculatorImpl {
	
	public static void main(String[] args) {
  
	Calculator calculator =  (input) -> System.out.println("Sum: "+input);
	calculator.sum(10);
		
		
//	 Calculator calculator  =	() -> 	System.out.println("switch On") ;		
//		calculator.switchOn();

	}
	// () -> { } ;	
}
