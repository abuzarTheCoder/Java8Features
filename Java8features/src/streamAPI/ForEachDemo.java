package streamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
         
         l1.add("Andrew");
         l1.add("Rickey");
         l1.add("Zerek");
         l1.add("Vrushali");
         l1.add("Vandana");
		
        // for(String s: l1)
        	
//         for(String p : l1)
//         {
//        	 if(p.startsWith("V"))
//        	 System.out.println(p);
//         }
         
         
         
         l1.stream().filter(t -> t.startsWith("V")).forEach( t  ->  System.out.println(t));
	
         
         
   //     (T t)  ->  System.out.println(s)  ;
      
         
	//l1.stream().forEach( t  ->  System.out.println(t));
	
	           Map<Integer, String> map = new HashMap<Integer, String>();
	           
	           map.put(1, "A");
	           map.put(2, "B");
	           map.put(3, "C");
	           map.put(4, "D");
	
	           
	           
//	      map.forEach( (key, value)  ->  System.out.println(key+" : "+value));     
	                map.entrySet().stream().filter(k -> k.getKey()%2 == 0 ).forEach(obj  ->  System.out.println(obj));    
//	     
//	     Consumer<String> consumer  = t -> System.out.println(t);
//	     consumer.accept("Abuzar");
	}
	
}
