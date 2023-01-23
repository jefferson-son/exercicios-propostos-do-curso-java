import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double tax8 = 0.0;
		double tax18 = 0.0;
		double tax28 = 0.0;
		double totalTax = 0.0;

		double salary = sc.nextDouble();

		if (salary <= 2000.0) {
			System.out.println("Isento");
		} 
		else if (salary > 2000.0 && salary <= 3000.0) {
			tax8 = (salary - 2000.0) * 8 / 100;
			System.out.println("Isento");
		} 
		else if (salary > 3000.0 && salary <= 4500.0) {
			tax8 = 999.99 * 8 / 100;
			//Imposto incidiu apenas em cima do que reestou do salário. Taxando 18% + 8% anteriores.
			tax18 = (salary - 2999.99) * 18 / 100;
			totalTax = tax8 + tax18;
			System.out.printf("%.2f",totalTax);
		} 
		else if (salary > 4500.0) {
			tax8 = 999.99 * 8 / 100;
			tax18 = 1499.99 * 18 / 100;
			//Imposto incidiu apenas em cima do que reestou do salário. Taxando 28% + 18% e 8% anteriores.
			tax28 = (salary - 4500.0) * 28 / 100;
			totalTax = tax8 + tax18 + tax28;
			System.out.printf("%.2f",totalTax);
		}

		sc.locale();
	}

}
