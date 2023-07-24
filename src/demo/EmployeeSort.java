package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private Integer id;
	private String name;
	private Long salary;

	public Employee(Integer id, String name, Long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
}

public class EmployeeSort {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
		new Employee(101, "Dinesh", 2000L),
		new Employee(301, "Bala", 3000L),
		new Employee(201, "Chandru", 2500L),
		new Employee(401, "Anand", 5000L));

		System.out.println("Before Sorting");
		System.out.println("--------------\n");
		employees.forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));

		List<Employee> sortedEmployeesByName = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println("\nAfter Sorting by employee name");
		System.out.println("--------------------------------\n");
		sortedEmployeesByName.forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
		
		List<Employee> sortedEmployeesById = employees.stream().sorted(Comparator.comparing(Employee::getId).reversed())
				.collect(Collectors.toList());
		System.out.println("\nAfter Sorting  by employee id");
		System.out.println("-------------------------------\n");
		sortedEmployeesById.forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
		
		List<Employee> sortedEmployeesBySalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println("\nAfter Sorting  by employee salary");
		System.out.println("-----------------------------------\n");
		sortedEmployeesBySalary.forEach(employee -> System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
	}
}
