package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Person> persons = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numberTaxPayers = scanner.nextInt();

		for (int i = 0; i < numberTaxPayers; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char typePerson = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = scanner.nextDouble();

			if (typePerson == 'i') {
				System.out.print("Health expenditures: ");
				double health = scanner.nextDouble();

				persons.add(new IndividualPerson(name, anualIncome, health));
			} 
			else if (typePerson == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployes = scanner.nextInt();

				persons.add(new CompanyPerson(name, anualIncome, numberEmployes));
			}

			System.out.println();
		}

		System.out.println("TAXES PAID: ");
		for (Person pers : persons) {
			System.out.println(pers.getName() + ": $ " + String.format("%.2f", pers.tax()));
		}
		
		double totalTax = 0.0;
		for (Person pers : persons) {
			totalTax += pers.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f ",totalTax);

		scanner.close();
	}

}
