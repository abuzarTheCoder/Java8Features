package mapFlatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		   List<Customer> customers = EkartDataBase.getAll();
		   //convert List<Customer> to List<String>
		   //customer -> customer.getEmail()  this is one to one mapping
		   
		   List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		   
		   System.out.println(emails);
		   
		    List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
		   
		    System.out.println(phoneNumbers);
		    
		    
		    List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());

		    System.out.println(phones);
		    
	}

}
