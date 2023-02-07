package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDateTime moment = LocalDateTime.now();

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String nameClient = scanner.nextLine();
		System.out.print("Email: ");
		String emailClient = scanner.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthClient = LocalDate.parse(scanner.nextLine(), dtf);

		Client client = new Client(nameClient, emailClient, birthClient);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String statusOrder = scanner.nextLine();

		Order order = new Order(moment, OrderStatus.valueOf(statusOrder), client);

		System.out.print("How many items to this order? ");
		int numberItensOrder = scanner.nextInt();

		for (int i = 0; i < numberItensOrder; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");
			scanner.nextLine();
			System.out.print("Product name: ");
			String nameProduct = scanner.nextLine();
			System.out.print("Product price: ");
			double priceProduct = scanner.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct = scanner.nextInt();

			Product product = new Product(nameProduct, priceProduct);
			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);

			order.addItem(orderItem);
		}
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY: ");
		
		System.out.println(order);

		scanner.close();
	}

}
