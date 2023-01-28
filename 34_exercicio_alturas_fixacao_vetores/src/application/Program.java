package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int N = sc.nextInt();
		Person[] person = new Person[N];

		for (int i = 0; i < person.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.printf("Idade: ");
			int age = sc.nextInt();
			System.out.printf("Altura: ");
			double height = sc.nextDouble();

			person[i] = new Person(name, age, height);
		}

		double sum = 0.0;
		int underSixteen = 0;
		for (int i = 0; i < person.length; i++) {
			// Acumulador das alturas
			sum += person[i].getHeight();
			if (person[i].getAge() < 16) {
				// Acumulador das idades < 16.
				underSixteen += 1;
			}
		}

		double averageHeight = sum / person.length;
		double percentageUnderSixteen = (underSixteen * 100) / person.length;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", averageHeight);
		System.out.println("Pessoas com menos de 16 anos: " + percentageUnderSixteen + "%");
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();
	}

}
