package entities;

public class Alunos {
	
	public String Name;
	public double semestreUm;
	public double semestreDois;
	public double semestreTres;
	
	public double alunoNotaFinal() {
		
		double resultado = semestreUm + semestreDois + semestreTres;
		return resultado;
	}
	
	public void alunoFinalGrade() {
		
		double notaFinal = semestreUm + semestreDois + semestreTres;
		if(notaFinal >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			double notaRestante = 60 - notaFinal;
			System.out.println("MISSING " +  String.format("%.2f", notaRestante) + " POINTS");
		}
		
	}
	
	
	

}
