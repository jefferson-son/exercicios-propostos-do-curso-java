package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int N = sc.nextInt();
		Student[] student = new Student[N];

		for (int i = 0; i < student.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			sc.nextLine();
			String name = sc.nextLine();
			double firstNote = sc.nextDouble();
			double secondNote = sc.nextDouble();

			student[i] = new Student(name, firstNote, secondNote);
		}

		System.out.println("Alunos aprovados: ");
		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < student.length; i++) {
			sum = student[i].getFirstNote() + student[i].getSecondNote();
			avg = sum / 2;
			if (avg >= 6.0) {
				System.out.println(student[i].getName());
			}
		}

		sc.close();
	}

}
