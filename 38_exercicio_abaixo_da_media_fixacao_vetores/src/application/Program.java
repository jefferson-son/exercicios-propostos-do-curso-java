package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		double[] vectAvg = new double[N];

		double sum = 0.0;
		for (int i = 0; i < vectAvg.length; i++) {
			System.out.print("Digite um numero: ");
			vectAvg[i] = sc.nextDouble();
			sum += vectAvg[i];
		}

		double average = sum / vectAvg.length;
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", average);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vectAvg.length; i++) {
			if (vectAvg[i] < average) {
				System.out.println(vectAvg[i]);
			}
		}

		sc.close();
	}

}
