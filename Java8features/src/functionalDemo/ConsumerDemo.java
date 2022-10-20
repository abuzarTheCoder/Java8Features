package functionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Printing : "+t);
//		
//	}

	public static void main(String[] args) {
		
//		 Consumer<Integer> Consumer =  t -> System.out.println("Printing :"+t) ;
//		 Consumer.accept(13);
	 
		 
		    List<Integer> l = Arrays.asList(1,2,3,4,5);
		    l.stream().forEach(t   ->   System.out.println("Printing :"+t));
	}
	
	//() -> {   }
	
}
