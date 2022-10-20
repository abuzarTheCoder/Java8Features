package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import streamAPI.Database;
import streamAPI.Employee;

public class SortListTest {
	
  public static void main(String[] args) {
	  List<Integer> l1 = new ArrayList<Integer>();
      
      l1.add(8);
      l1.add(4);
      l1.add(13);
      l1.add(9);
      l1.add(16);
      
    //  Collections.sort(l1);
     // Collections.reverse(l1);
     // System.out.println(l1);
      
    //  l1.stream().sorted().forEach(s -> System.out.println(s));
      
     // l1.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
      
     List<Employee> employees = Database.getEmployees();
//     Collections.sort(employees, new Comparator<Employee>() {
//
//    	 @Override
//    		public int compare(Employee o1, Employee o2) {   			
//    			return (int) (o1.getSalary() - o2.getSalary());
//    		}
//		
//	});
     
    // Comparator<Employee> comparator =  (o1, o2) -> (int) ((o1).getSalary() - (o2).getSalary());
		
      //Collections.sort(employees, (o1, o2) -> (int) ((o1).getSalary() - (o2).getSalary()));
      
   //   employees.stream().sorted((o1, o2) -> (int) ((o2).getSalary() - (o1).getSalary())).forEach(System.out::println) ;
   //   employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println) ;
      employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println) ;
      System.out.println("****************************************");
      employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println) ;

      // System.out.println(employees);
}
}
