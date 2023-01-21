import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int workedHours = sc.nextInt();
		double valuePerHour = sc.nextDouble();
		
		double valuePerHourWorked = workedHours * valuePerHour;
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", valuePerHourWorked);
		
		sc.close();
	}

}
