package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberLines = scanner.nextInt();
		int numberColumns = scanner.nextInt();
		
		int[][] matrix = new int[numberLines][numberColumns];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int findNumber = scanner.nextInt();
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == findNumber) {
					System.out.println("Position "+ i + "," + j);	
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		
		scanner.close();
	}

}
