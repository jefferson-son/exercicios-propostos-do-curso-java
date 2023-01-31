package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		double[] vectPair = new double[N];

		double sum = 0.0;
		int accumulator = 0;
		for (int i = 0; i < vectPair.length; i++) {
			System.out.print("Digite um numero: ");
			vectPair[i] = sc.nextDouble();
			if (vectPair[i] % 2 == 0) {
				sum += vectPair[i];
				accumulator += 1;

			}
		}

		if (accumulator > 0) {
			double mediaPairs = sum / accumulator;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPairs);
		} 
		else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
