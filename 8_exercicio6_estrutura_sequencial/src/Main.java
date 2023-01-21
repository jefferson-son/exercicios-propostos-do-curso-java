import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double rightTriangleArea = (A * C) / 2;
		double radiousCircleArea = pi * Math.pow(C, 2);
		double trapezeArea = (A + B) * C / 2;
		double squareArea = Math.pow(B, 2);
		double rectangle = A * B;

		System.out.printf("TRIANGULO: %.3f%n", rightTriangleArea);
		System.out.printf("CIRCULO: %.3f%n", radiousCircleArea);
		System.out.printf("TRAZPÉZIO: %.3f%n", trapezeArea);
		System.out.printf("QUADRADO: %.3f%n", squareArea);
		System.out.printf("RETÂNGULO: %.3f%n", rectangle);

		sc.close();
	}

}
