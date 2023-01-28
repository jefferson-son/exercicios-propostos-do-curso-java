package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		int[] numbers = new int[N];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NUMEROS PARES:");
		int pairNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				pairNumbers += 1;
				System.out.print(numbers[i] + "  ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + pairNumbers);

		sc.close();
	}

}
