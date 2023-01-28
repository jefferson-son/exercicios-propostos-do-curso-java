package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		double[] sumVect = new double[N];

		for (int i = 0; i < sumVect.length; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			sumVect[i] = num;
		}

		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < sumVect.length; i++) {
			System.out.print(sumVect[i] + "  ");
		}

		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < sumVect.length; i++) {
			sum += sumVect[i];
			avg = sum;
		}

		double average = avg / sumVect.length;
		System.out.printf("%nSOMA = %.2f", sum);
		System.out.printf("%nfSOMA = %.2f", average);

		sc.close();
	}

}
