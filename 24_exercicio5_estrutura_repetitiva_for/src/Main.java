import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int factorial = n;
		int accumulator = 0;

		for (int i = 1; i < n; i++) {
			accumulator = factorial * (n - i);
			factorial = accumulator;
		}
		if (factorial == 0) {
			factorial = 1;
		}

		System.out.println(factorial);

		sc.close();
	}

}
