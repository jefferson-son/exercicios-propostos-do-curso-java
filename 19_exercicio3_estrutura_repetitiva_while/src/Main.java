import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual seu combustível de preferência?");
		System.out.println();
		System.out.println("1-Álcool, 2-Gasolina, 3-Diesel, 4 -> SAIR");
		int fuel = sc.nextInt();

		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		//Adionada condição caso o usuário digite um número fora da faixa antes de iniciar a avaliação.
		if (fuel > 4) {
			System.out.println("CÓDIGO INVÁLIDO!");
			fuel = sc.nextInt();
		}

		while (fuel >= 1 && fuel < 4) {
			
			if (fuel == 1) {
				alcohol += 1;
			} 
			else if (fuel == 2) {
				gasoline += 1;
			} 
			else if (fuel == 3) {
				diesel += 1;
			}

			fuel = sc.nextInt();
			
			//Adionada condição caso o usuário digite um número fora da faixa durante a avaliação.
			if(fuel > 4) {
				System.out.println("CÓDIGO INVÁLIDO!");
				fuel = sc.nextInt();
			}
		}

		if (fuel == 4) {
			System.out.println("MUITO OBRIGADO");
			System.out.println("Álcool: " + alcohol);
			System.out.println("Gasolina: " + gasoline);
			System.out.println("Diesel: " + diesel);
		}

		sc.close();
	}
}
