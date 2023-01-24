import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			double square = Math.pow(i, 2);
			double cube = Math.pow(i, 3);
			
			// Saída dos resultados com TYPECASTING para conversão do tipo DOUBLE em INT.
			System.out.println(i + " " + (int) square + " " + (int) cube);
		}
		sc.close();
	}

}
