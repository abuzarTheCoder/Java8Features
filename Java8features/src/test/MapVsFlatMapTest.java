package test;

import java.util.List;
import java.util.stream.Collectors;

import mapFlatmap.Customer;
import mapFlatmap.EkartDataBase;

public class MapVsFlatMapTest {

	public static void main(String[] args) {

		List<Customer> customers = EkartDataBase.getAll();

		// List<Customer> convert List<String> i.e List of emailIDs -> Data	Transformation
		// mapping : customer -> customer.getEmail() one to one mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		//customer -> customer.getPhoneNumbers()     one to many mapping

		List<List<String>> phoneList = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneList);
		
		
		// List<Customer> convert List<String> i.e List of phoneNo -> Data	Transformation
		// mapping : customer -> phone numbers
		// customer -> customer.getPhoneNumbers() ->> one to many mapping
		
	 List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
	 System.out.println(phones);
	}

}
