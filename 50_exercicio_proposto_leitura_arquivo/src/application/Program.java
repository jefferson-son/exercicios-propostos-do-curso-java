package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();

		// try-with-resources
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			// Lendo a primeira linha do arquivo
			String lines = br.readLine();
			while (lines != null) {

				String itens = lines;

				String[] products = itens.split(",");

				String name = products[0];
				String value = products[1];
				String quantity = products[2];

				Product product = new Product(name, Double.parseDouble(value), Integer.parseInt(quantity));
				list.add(product);

				// Enquando a linha não for nula, vai ler a próxima linha.
				lines = br.readLine();

			}
			System.out.println("Digite o nome da nova pasta: ");
			String newFolder = "c:\\temp\\csv\\" + sc.nextLine();

			boolean success = new File(newFolder).mkdir();
			if (success != false) {
				System.out.println("Pasta criada com sucesso!");
			} 
			else {
				System.out.println("Pasta já existe!");
			}

			// try-with-resources
			String pathSummaryFile = newFolder + "\\summary.csv";
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathSummaryFile, true))) {

				for (Product prod : list) {

					bw.write(prod.getName() + ", R$ " + String.format("%.2f", prod.totalAmount()));
					bw.newLine();

				}

				File nameFile = new File(pathSummaryFile);
				if (success != false) {
					System.out.println("Arquivo \"" + nameFile.getName() + "\" criado com sucesso!");
				} 
				else {
					System.out.println("Arquivo \"" + nameFile.getName() + "\" já existe!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
