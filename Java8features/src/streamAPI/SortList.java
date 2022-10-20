package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.sampled.ReverbType;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
        
        l1.add(8);
        l1.add(4);
        l1.add(13);
        l1.add(9);
        l1.add(16);
		
//		Collections.sort(l1);
//        Collections.reverse(l1);
//		System.out.println(l1);
//        
//		l1.stream().sorted().forEach(s -> System.out.println(s));  //Ascending
//		l1.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));  //Descending
	
       
        List<Employee>    employees =  Database.getEmployees();
//        Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary()-o2.getSalary());			
//			}
//		
//		});
//        System.out.println(employees);
	
        
			
		Collections.sort(employees, (o1, o2) ->  (int) (o2.getSalary()-o1.getSalary()));
      //  System.out.println(employees);
        
      //  employees.stream().sorted((o1, o2) ->  (int) (o1.getSalary()-o2.getSalary())).forEach(System.out::println);
        
       // employees.stream().sorted(Comparator.comparing(empl -> empl.getSalary())).forEach(System.out::println);
     
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
        
	}
	
	 
		
	}
	
//class MyComparator implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return (int) (o2.getSalary()-o1.getSalary());//ascending
//	}

