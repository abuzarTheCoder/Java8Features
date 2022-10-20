package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
	//	Consumer<Integer> consumer =  t  ->	System.out.println("Printing: "+t);
		//consumer.accept(11);
		
         List<Integer> list1 = Arrays.asList(1,3,5,7,9);
         list1.stream().forEach(t  ->	System.out.println("Printing: "+t));
		
	}

}
