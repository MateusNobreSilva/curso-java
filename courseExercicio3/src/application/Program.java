package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos alunos = new Alunos();
		
		
		System.out.print("Name: ");
		alunos.Name = sc.nextLine();
		
		System.out.print("1 semestre: ");
		alunos.semestreUm = sc.nextDouble();
		
		System.out.print("2 semestre: ");
		alunos.semestreDois = sc.nextDouble();
		
		System.out.print("3 semestre: ");
		alunos.semestreTres = sc.nextDouble();
		
		double notaFinal = alunos.alunoNotaFinal();
		System.out.println("FINAL GRADE = " +String.format("%.2f", notaFinal) );
		
		alunos.alunoFinalGrade();
		
		
		sc.close();
	}

}
