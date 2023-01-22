import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("CODIGO    ESPECIFICAÇÃO    PREÇO  ");
		System.out.println("----------------------------------");
		System.out.println("1         Cachorro Quente  R$ 4.00");
		System.out.println("2         X-Salada         R$ 4.50");
		System.out.println("3         X-Bacon          R$ 5.00");
		System.out.println("4         Torrada Simples  R$ 2.00");
		System.out.println("5         Refrigerante     R$ 1.50");
		System.out.println("----------------------------------");
		
		int hotDog = 1;
		int xSalad = 2;
		int xBacon = 3;
		int plainTost = 4;
		int refrigerator = 5;
		double total = 0.0;
		
		int item = sc.nextInt();
		int amount = sc.nextInt();
		
		if(item == 1) {
			total = 4.00 * amount;
		}
		else if(item == 2) {
			total = 4.50 * amount;
		}
		else if(item == 3) {
			total = 5.00 * amount;
		}
		else if(item == 4) {
			total = 2.00 * amount;
		}
		else if(item == 5) {
			total = 1.50 * amount;
		}
		
		System.out.printf("Total : R$ %.2f", total);
		
		sc.close();
	}

}
