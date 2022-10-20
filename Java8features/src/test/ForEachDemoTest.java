package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemoTest {

	public static void main(String[] args) {

		      List<String> list = new ArrayList<>();
		      list.add("Abuzar");
		      list.add("Ammad");
		      list.add("Roshan");
		      list.add("Sameer");
		      list.add("Wasi");
		      
//		      for(String s : list) {
//		    	  if(s.startsWith("A")) {
//		    		  System.out.println(s);
//		    	  }
//		      }		   
		   	      
		  //    list.stream().filter(t -> t.startsWith("A")).forEach(t ->   System.out.println(t));
		      
		      
//		      for(String s : list) {
//		    	System.out.println(s);  	    	  
//		      }
		      
		   //Consumer<String> consumer = t ->   System.out.println(t);

		     // list.stream().forEach(t ->   System.out.println(t));;
	
	
		      Map<Integer, String> map = new HashMap<>() ;
		      map.put(1, "a");
		      map.put(2, "b");
		      map.put(3, "c");
		      map.put(4, "d");
		      
//		      map.forEach((key, value) -> System.out.println(key+ " : "+ value));
//		      map.entrySet().stream().forEach(obj -> System.out.println(obj));
		      map.entrySet().stream().filter(k -> k.getKey()%2 == 0).forEach(obj -> System.out.println(obj));
	   
//		     Consumer<String> consumer =  (t) ->  System.out.println(t);
//              for(String s: list) {
//            	  consumer.accept(s);
//              }

		    	
		    
	}
// () -> {};
	
	
	
}
