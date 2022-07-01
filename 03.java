// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (1º trimestre a nota vale 30 e no 2º e 3º valem 35 cada), Ao final , mostrar qual a nota final do alçuno no ano, dizer também se o aluno está aprovador (PASS) ou não (FAILED) e, em caso negativo, 
//quantos pontos faltam para o aluno obter o mínimo para ser aprovado, (que é 60% na nota total), criar a classe aluno para resolver este problema.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		aluno aluno = new aluno();
		System.out.println("Digite seu nome");
		aluno.nome =sc.nextLine();
		System.out.println("Digite a nota do 1º trimestre");
		aluno.nota01 =sc.nextDouble();
		while ( aluno.nota01 > 30) {
			System.out.println ("A nota do 1º trimestre precisa ser inferior a 30");
			System.out.println ("Digite novamente a nota do 1º trimestre, lembrando que "
					+ "a mesma deverá  precisa ser inferior a 30");
			aluno.nota01 =sc.nextDouble();
		}
		System.out.println("Digite a nota do 2º trimestre");
		aluno.nota02 =sc.nextDouble();
		while ( aluno.nota02 > 35) {
			System.out.println ("A nota do 1º trimestre precisa ser inferior a 35");
			System.out.println ("Digite novamente a nota do 2º trimestre");
			aluno.nota02 =sc.nextDouble();
		}
		System.out.println("Digite a nota do 3º trimestre");
		aluno.nota03 =sc.nextDouble();
		while ( aluno.nota03 > 35) {
			System.out.println ("A nota do 3º trimestre precisa ser inferior a 35");
			System.out.println ("Digite novamente a nota do 3º trimestre");
			aluno.nota03 =sc.nextDouble();
		}
		
		if (aluno.MediaAnual()  > 6) {
			System.out.printf("Media Anual é de : %.2f%n", aluno.MediaAnual()  );
			System.out.println("PASS");
		}
		else if (aluno.MediaAnual()  < 6.00) {
			double retanteParaMedia = ( aluno.MediaAnual()  - 6.00);
			System.out.printf("Media Anual é de : %.2f%n", aluno.MediaAnual() );
			System.out.println("FAILED");
			System.out.printf("Nota faltante para aprovação %.2f%n", retanteParaMedia );
		}
	
		sc.close();
	}

}

package entities;

public class aluno {
	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;
	
	public double MediaAnual() {
		double mediaanual = (nota01 + nota02 + nota03);
		return mediaanual;
	}
	
	public double Aprovacao() {
		if (MediaAnual() < 6.0) {
			double aprovacao = MediaAnual() - 6;
			return aprovacao;
		}
		else {
			return 0;
		}
	}
}

