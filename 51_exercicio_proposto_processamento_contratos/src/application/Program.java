package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import domain.entities.Contract;
import domain.entities.Installment;
import domain.services.ContractService;
import domain.services.PayPalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(contract, numberInstallments);
		
		System.out.println("PARCELAS: ");
		
		for(Installment installments : contract.getInstallment()) {
			System.out.println(installments);
		}
		
		
		sc.close();

	}

}
