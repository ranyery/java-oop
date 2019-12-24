package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = input.nextInt();
		
		List<Employee> employee = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.print("Employee #" + i + ": ");
			System.out.println();
			System.out.print("Id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			employee.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = input.nextInt();
		Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = input.nextDouble();
			emp.increasePercentage(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : employee) {
			System.out.println(e);
		}
		
		input.close();

	}

}
