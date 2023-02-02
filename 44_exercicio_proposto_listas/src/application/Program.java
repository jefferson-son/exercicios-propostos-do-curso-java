package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int numberEmployees = scanner.nextInt();

		for (int i = 0; i < numberEmployees; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			
			// Condição para verificar a existência de ID já cadastrado. Se existente, retorna existência e solicita novo ID.
			for (int j = 0; j < employee.size(); j++) {
				Employee employeeTemp = employee.get(j);

				if (id == employeeTemp.getId()) {
					System.out.println("ID already exists, try again!");
					System.out.println();
					System.out.print("Id: ");
					id = scanner.nextInt();
					scanner.nextLine();
				}
			}

			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();

			employee.add(new Employee(id, name, salary));
		}

		System.out.println();

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = scanner.nextInt();

		/* Busca do ID com stream da lista employee com filter() correspondente a um predicado, o método findFirst() para localizar a primeira ocorrência do ID 
		e o método orElse(null) para retornar nullo caso não seja encontrado ID passado no predicado.
		*/
		Employee searchId = employee.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);

		if (searchId == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = scanner.nextDouble();
			searchId.increaseSalary(percentage);
		}

		System.out.println();

		System.out.println("List of employees:");
		for (Employee employees : employee) {
			System.out.println(employees);
		}

		scanner.close();
	}

}
