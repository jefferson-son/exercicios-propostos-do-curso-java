package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		BankAccount bankAccount = new BankAccount(account, holder);

		System.out.print("Is there na initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			bankAccount.deposit(deposit);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bankAccount.deposit(deposit);
		System.out.println("Updated accout data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bankAccount.withdraw(withdraw);
		System.out.println("Updated accout data: ");
		System.out.print(bankAccount);


		sc.close();
	}

}
