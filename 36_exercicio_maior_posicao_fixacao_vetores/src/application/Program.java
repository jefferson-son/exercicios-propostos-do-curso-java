package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar: ");
		int N = sc.nextInt();
		double[] numbers = new double[N];

		double maxValue = 0.0;
		int position = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
				position = i;
			}
		}

		System.out.println();
		System.out.println("MAIOR VALOR = " + maxValue);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + position);

		sc.close();
	}

}
