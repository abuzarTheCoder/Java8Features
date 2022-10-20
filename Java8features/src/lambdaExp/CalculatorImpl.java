package lambdaExp;
import lambdaExp.Calculator;

public class CalculatorImpl {

		
	

	public static void main(String[] args) {
		
		//Calculator calculator    =	()  -> 	System.out.println("Switch on");
			
		//calculator.switchOn();

		
//		Calculator calculator     = (input)  -> System.out.println("Sum:  "+input);
//		
//		calculator.sum(10);
		
		Calculator calculator     = (i1, i2)  -> {  
			if(i2 < i1)
			throw new RuntimeException("message");
			else
				return i2-i1;
		};
		;
		
		  System.out.println( calculator.subtract(10, 15));
		
		//  ()    ->    { body }
		
	}
	
}
