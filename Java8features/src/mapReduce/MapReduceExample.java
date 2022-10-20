package mapReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {

		
		// To find the average of salary with grade A
		// first get employees with grade A
		// get salary of the employee
		//convert to double as average  can  be in decimal 
		
		double averageSalary = EmployeeDatabase.getEmployees().stream()
		.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
		.map(employee -> employee.getSalary()).mapToDouble(i -> i)
		.average().getAsDouble();
		
		System.out.println("Average salary of employees with grade A : "+averageSalary);
		
		double sumSalary = EmployeeDatabase.getEmployees().stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary()).mapToDouble(i -> i).sum();
		
		System.out.println("Sum of salary of employees whose grade is A : "+sumSalary);
				
	}

}
