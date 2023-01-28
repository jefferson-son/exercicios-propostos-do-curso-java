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

		int zero = 0;
		// Adicionado laço para acumular a existência de negativos, e realizar a condição posteriormente;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				zero = numbers[i];
			}
		}

		// Condição fora do exercício para uma possível digitação apenas de números positivos.
		if (zero < 0) {
			System.out.println("NÚMEROS NEGATIVOS: ");
		} 
		else {
			System.out.println("NENHUM NÚMERO NEGATIVO!");
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}

		sc.close();
	}

}
