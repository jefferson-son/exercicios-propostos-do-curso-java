package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		int[] vectA = new int[N];
		int[] vectB = new int[N];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}

		System.out.println("VETOR RESULTANTE: ");
		int[] vectC = new int[N];
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}

		sc.close();
	}

}
