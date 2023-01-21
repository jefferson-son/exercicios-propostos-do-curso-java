import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double raio = sc.nextDouble();

		// Cálculo de pi pelo raio elevado ao quadrado.
		double area = pi * Math.pow(raio, 2);

		System.out.printf("A = %.4f", area);

		sc.close();
	}

}
