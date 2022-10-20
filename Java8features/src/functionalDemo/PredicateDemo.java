package functionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

//		Predicate<Integer> predicate = t -> t % 2 == 0 ;
//		System.out.println(predicate.test(8));
		

//		Predicate<Integer> predicate =  new PredicateDemo();
//		System.out.println(predicate.test(5));

		

		List<Integer> li = Arrays.asList(1,2,3,4,5);
		
		li.stream().filter(t -> t % 2 == 0).forEach(t   ->   System.out.println("Printing even : "+t));
	//	li.stream().filter(t -> t % 2 != 0).forEach(t   ->   System.out.println("Printing odd : "+t));
		// () -> { }
	}
}
