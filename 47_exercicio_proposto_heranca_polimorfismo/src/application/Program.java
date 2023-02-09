package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char resp = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			if (resp == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else if (resp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(scanner.next(), dtf);
				products.add(new UsedProduct(name, price, manufactureDate));
			} else if (resp == 'c') {
				products.add(new Product(name, price));
			}

			System.out.println();
		}

		System.out.println("PRICE TAGS: ");

		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}

		scanner.close();
	}

}
