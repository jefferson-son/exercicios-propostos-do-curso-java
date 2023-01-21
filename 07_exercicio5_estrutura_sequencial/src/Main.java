import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int partCode1, partNumber1, partCode2, partNumber2;
		double unitaryValue1, unitaryValue2, totalValue;
		
		partCode1 = sc.nextInt();
		partNumber1 = sc.nextInt();
		unitaryValue1 = sc.nextDouble();
		
		partCode2 = sc.nextInt();
		partNumber2 = sc.nextInt();
		unitaryValue2 = sc.nextDouble();
		
		totalValue = (partNumber1 * unitaryValue1) + (partNumber2 * unitaryValue2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalValue);
		
		sc.close();
	}

}
