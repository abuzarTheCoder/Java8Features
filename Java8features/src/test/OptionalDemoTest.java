package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import mapFlatmap.Customer;
import mapFlatmap.EkartDataBase;

public class OptionalDemoTest {

	
	public static Customer getCustomerByEmailId(String email) throws Exception {
		 List<Customer> customers = EkartDataBase.getAll();
		 return customers.stream().
		 filter(customer -> customer.getEmail().
				 equals(email)).findAny().orElseThrow(() -> new Exception("no customer present with this emaild"));
			
	}
	
	public static void main(String[] args) throws Exception {
       // Customer customer1 = new Customer(102, "smith", null, Arrays.asList("89563865", "2487238947"));
       Customer customer1 = new Customer(102, "smith", "aabsharimam@gmail.com", Arrays.asList("89563865", "2487238947"));

       //empty
       //of
       //nullable
       
               Optional<Object> emptyOptional = Optional.empty();
             //  System.out.println(emptyOptional);
               
             //Optional<String> emailOptional = Optional.of(customer1.getEmail());
          //   System.out.println(emailOptional);
             
             Optional<String> emailOptional2 = Optional.ofNullable(customer1.getEmail());
//             if(emailOptional2.isPresent()) {
//                 System.out.println(emailOptional2.get());
//             }
       //     System.out.println(emailOptional2.orElse("default@email.com"));
             
          //   System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("Email not present")) ) ;
             
         //    System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "...default mail..."));
             
             getCustomerByEmailId("pqr");
             
             
	}
}
