package parallelStream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

		/*
		 * start = System.currentTimeMillis(); IntStream.range(1,
		 * 100).forEach(System.out::println); end = System.currentTimeMillis() ;
		 * System.out.println("Plain stream took time = "+ (end - start));
		 * 
		 * System.out.println("*************************************************");
		 * 
		 * start = System.currentTimeMillis(); IntStream.range(1,
		 * 100).parallel().forEach(System.out::println); end =
		 * System.currentTimeMillis() ;
		 * System.out.println("Parallel stream took time = "+ (end - start));
		 */

		/*
		 * IntStream.range(1, 10).forEach(x -> { System.out.println("plain Thread : " +
		 * Thread.currentThread().getName() + " : " + x); });
		 * 
		 * 
		 * IntStream.range(1, 10).parallel().forEach(x -> {
		 * System.out.println("Parallel Thread : " + Thread.currentThread().getName() +
		 * " : " + x); });
		 */

		// normal stream
		List<Employee> employees = EmployeeDatabase.getEmployees();

		start = System.currentTimeMillis();
		double avgSalary = employees.stream().map(employee -> employee.getSalary()).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Normal stream execution time = " + (end - start) +" : Average Salary = " + avgSalary);

		System.out.println("*************************************************");

		start = System.currentTimeMillis();
		double salaryParallelStream = employees.parallelStream().map(employee -> employee.getSalary())
				.mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Parallel stream execution time = " + (end - start) +" : Average Salary = " + salaryParallelStream);
	}

}
