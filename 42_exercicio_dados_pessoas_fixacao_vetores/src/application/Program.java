package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		People[] people = new People[N];

		for (int i = 0; i < people.length; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
			char gener = sc.next().charAt(0);

			people[i] = new People(height, gener);
		}

		double maxHeight = 0.0;
		double minHeight = 0.0;
		double sumWoman = 0.0;
		int qntWoman = 0;
		int qntMan = 0;

		for (int i = 0; i < people.length; i++) {
			if (people[i].getGener() == 'f') {
				sumWoman += people[i].getHeight();
				qntWoman += 1;
			} else {
				qntMan += 1;
			}
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i].getHeight() > maxHeight) {
				maxHeight = people[i].getHeight();
				minHeight = people[0].getHeight();
			}
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i].getHeight() < minHeight) {
				minHeight = people[i].getHeight();
			}
		}

		double averageWoman = sumWoman / qntWoman;
		System.out.println();
		System.out.printf("Menor altura = %.2f%n", minHeight);
		System.out.printf("Maior altura = %.2f%n", maxHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", averageWoman);
		System.out.print("Número de homens = " + qntMan);

		sc.close();
	}

}
