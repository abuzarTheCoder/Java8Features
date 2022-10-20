package mapReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	
	public static List<Employee> getEmployees(){
		
		return Stream.of(new Employee(100, "John", "A", 60000),
				new Employee(101, "Peter", "B", 30000),
				new Employee(102, "Mak", "A", 80000),
				new Employee(103, "Kim", "A", 90000),
				new Employee(104, "Jason", "C", 15000))
				.collect(Collectors.toList());	
	}
}
