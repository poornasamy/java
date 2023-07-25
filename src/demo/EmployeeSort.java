package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
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
		List<Employee> employees = Arrays.asList(new Employee(101, "Dinesh", 2000L), new Employee(301, "Bala", 3000L),
				new Employee(201, "Chandru", 2500L), new Employee(401, "Anand", 5000L));

		System.out.println("Before Sorting");
		System.out.println("--------------\n");
		employees.forEach(employee -> System.out
				.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));

		System.out.println("\n1. Sort by id in ascending");
		System.out.println("2. Sort by name in ascending");
		System.out.println("3. Sort by salary in ascending");
		System.out.println("4. Sort by id in descending");
		System.out.println("5. Sort by name in descending");
		System.out.println("6. Sort by salary in descending");
		System.out.println("0. Exit");
		System.out.println("Sort by id in ascending by default");

		try (Scanner sc = new Scanner(System.in)) {
			int option = 0;
			do {
				System.out.println("\nEnter your choice");
				option = sc.nextInt();
				List<Employee> sortedEmployees = new ArrayList<>();
				switch (option) {
				case 0:
					System.out.println("Exiting...");
					break;
				case 1:
					System.out.println("\nAfter Sort by id in ascending");
					System.out.println("-------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getId))
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
					break;
				case 2:
					System.out.println("\nAfter Sort by name in ascending");
					System.out.println("---------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName))
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
					break;
				case 3:
					System.out.println("\nAfter Sort by salary in ascending");
					System.out.println("-----------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
					break;
				case 4:
					System.out.println("\nAfter Sort by id in descending");
					System.out.println("--------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getId).reversed())
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
					break;
				case 5:
					System.out.println("\nAfter Sort by name in descending");
					System.out.println("----------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
					break;
				case 6:
					System.out.println("\nAfter Sort by salary in descending");
					System.out.println("------------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
					break;
				default:
					System.out.println("\nAfter Sort by id in ascending by default");
					System.out.println("------------------------------------------\n");
					sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getId))
							.collect(Collectors.toList());
					sortedEmployees.forEach(employee -> System.out
							.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary()));
				}
			} while (option != 0);

		}
	}
}
