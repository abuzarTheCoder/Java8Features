package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

//	@Override
//	public String get() {
//		return "Hi Java Techie";
//	}
	
	public static void main(String[] args) {
          
		
		//Supplier<String> supplier = () ->  "Hi java techie";
			
		
	//	Supplier<String> supplier    = new SupplierTest() ;
	//	System.out.println(supplier.get());
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet( () ->  "Hi Newers") );

	}

	

	

}
