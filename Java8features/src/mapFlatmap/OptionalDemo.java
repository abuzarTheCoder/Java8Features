package mapFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static Customer getCustomerByEmailId(String mail) throws Exception {
		
		      List<Customer> customers = EkartDataBase.getAll();
		  
		      return customers.stream().
		    		  filter(customer -> customer.getEmail().equals(mail)).
		    		  findAny().orElseThrow(() -> new Exception("no such email present"));
		    		  
		      
		
		       
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		Customer customer = new Customer(101, "john", "mohammad.abuzar1@wipro.com", Arrays.asList("397937955", "21654725"));
		
		    Optional<Object> emptyOptional = Optional.empty();
		    System.out.println(emptyOptional);
		    
//		     Optional<String> ofOptional = Optional.of(customer.getEmail());
//		     System.out.println(ofOptional);
		     
		             Optional<String> ofOptional2 = Optional.ofNullable(customer.getEmail());
//		             if(ofOptional2.isPresent()) {
//		           System.out.println(ofOptional2.get());
//		             }
		     //     System.out.println(ofOptional2.orElse("default@email.com"));
		        //     System.out.println(ofOptional2.orElseThrow(() ->new IllegalArgumentException("no email present")));
	     
		             System.out.println(ofOptional2.map(String::toUpperCase).orElseGet(() -> "default email---"));
	
		             getCustomerByEmailId("uewe");
	
	}
		             
		             
	
}
