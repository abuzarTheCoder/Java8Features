package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExampleTest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		List<String> words = Arrays.asList("corejava","Spring","Hibernate");

//	     int sum = 0 ;
//	     for(int n : numbers) {
//	    	 sum = sum + n ;
//	     }
//	     System.out.println(sum);

		int mapSum = numbers.stream().mapToInt(i -> i).sum();
		System.out.println("map Sum : " + mapSum);

		Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("reduce Sum : " + reduceSum);

		Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
		System.out.println("Sum with Method Reference : " + sum.get());

		Integer product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Multiplication Result : " + product);
	
		 Integer max = numbers.stream().reduce(0, (a,b) -> a>b ? a:b) ;
		 System.out.println("max : "+max);
	
		  Integer max1 = numbers.stream().reduce(Integer::max).get();
		  System.out.println("max with method reference :"+max1);
		  
			String maxword = words.stream().
					reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
			System.out.println("word with maximum length : " + maxword);
	}

}
