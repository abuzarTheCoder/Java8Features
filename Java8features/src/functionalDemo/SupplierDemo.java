package functionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

//		Supplier<String>  supplier   = new SupplierDemo();
//        System.out.println(supplier.get()); 

		//Supplier<String> supplier = () -> "Hi Abuzar";

	//	System.out.println(supplier.get());

		List<String> list = Arrays.asList("a", "b");
		

		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Abuzar Mohd"));
		
		
	}

}
