import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();
			
			//Cálculo da média ponderada.
			double average = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);

			System.out.printf("%.1f", average);
		}
		sc.close();
	}
}
