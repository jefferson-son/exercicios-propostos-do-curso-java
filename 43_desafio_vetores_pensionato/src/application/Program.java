package application;

import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();

		Rent[] rent = new Rent[10];

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			rent[room] = new Rent(name, email);
		}

		System.out.println();

		System.out.println("Busy rooms: ");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}

		sc.close();
	}

}
