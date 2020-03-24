package ch.fhnw.oop2.module05.streams;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupBy {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Anna", "Q"));
		employees.add(new Employee("Bernt", "R"));
		employees.add(new Employee("Charles", "S"));
		employees.add(new Employee("Dora", "Q"));
		employees.add(new Employee("Erich", "R"));
		
		Map<String, List<Employee>> employeeByDepartments = 
				employees
					.stream()
					.collect(groupingBy(employee -> employee.department)); // Key Function
		
		Employee.print(employeeByDepartments);
	}

}

final class Employee {
	
	final String name;
	final String department;
	
	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	static void print(Map<String, List<Employee>> employeeByDepartments) {
		
		for(String department : employeeByDepartments.keySet()) {
			System.out.println("Department " + department);
			employeeByDepartments.get(department).stream().forEach(System.out::println);
			System.out.println("-------");
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
