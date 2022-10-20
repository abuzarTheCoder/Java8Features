package test;

import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
	 * else { return false; } }
	 */

	public static void main(String[] args) {

		//Predicate<Integer> predicate = t -> t % 2 == 0;
		//System.out.println(predicate.test(10));
		
		List<Integer> list1 = Arrays.asList(1,2,4,5,7,12,14);
        list1.stream().filter(t -> t % 2 == 0).forEach(t  ->	System.out.println("Printing Even: "+t));
	}
}
