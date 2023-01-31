package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		Person[] person = new Person[N];

		for (int i = 0; i < person.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();

			person[i] = new Person(name, age);
		}

		int sum = 0;
		String name = "";
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() > sum) {
				sum = person[i].getAge();
				name = person[i].getName();
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + name);

		sc.close();
	}

}
