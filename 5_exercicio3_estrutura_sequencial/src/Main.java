import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		// Cálculo da diferença dos produtos.
		int diferenca = (A*B) - (C*D);
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
