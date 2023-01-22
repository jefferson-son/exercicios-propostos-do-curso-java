import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int gameLength, init, end;
		init = sc.nextInt();
		end = sc.nextInt();

		if (init == end || end == init) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} 
		else if (init > end) {
			gameLength = (24 - init) + end;
			System.out.println("O JOGO DUROU " + gameLength + " HORA(S)");
		} 
		else {
			gameLength = end - init;
			System.out.println("O JOGO DUROU " + gameLength + " HORA(S)");
		}

		sc.close();
	}

}
