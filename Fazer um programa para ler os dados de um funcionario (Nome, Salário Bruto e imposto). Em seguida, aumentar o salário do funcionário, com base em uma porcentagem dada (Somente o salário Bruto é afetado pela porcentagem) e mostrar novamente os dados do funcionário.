//Fazer um programa para ler os dados de um funcionario (Nome, Salário Bruto e imposto). Em seguida, aumentar o salário do funcionário, com base em uma porcentagem dada (Somente o salário Bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
//Use a classe projetada :

//Nome : Joao Silva
//Salario Bruto : 6000.00
//Taxa: 1000.00
//Imprimir Joao Silva $ 5000.00

//Qual porcentagem aumentar sobre o salario? 10.00

//Atualizar dados: Joao Silva, $ 5600.00

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		funcionario func = new funcionario();
		
		System.out.println("Digite Seu nome , salário bruto , e valor da taxa de desconto");
		func.nome = sc.nextLine();
		func.salario = sc.nextDouble();
		func.taxaDesconto = sc.nextDouble();
		
		
		System.out.println("Dados atuais " + func);

		System.out.println ("Qual porcentagem aumentar sobre o salario?");
		func.taxaAumento = sc.nextDouble();
		System.out.print (" " + func.nome );
		System.out.printf("$  %.2f" , func.Aumento_Salario());
		
		sc.close();
	}

}
//Classe funcionario.java (pacote entities):

package entities;

public class funcionario {
	public String nome ;
	public double salario;
	public double taxaDesconto;
	public double taxaAumento;
	
	public double Salario_Liquido() {
		double salarioLiquido = salario - taxaDesconto ;
		return salarioLiquido; 
		
	}
	public double Aumento_Salario() {
		double ValorDoAumento = taxaAumento / 100 ; 
		double aumentoSalario = ((salario) + (salario * ValorDoAumento)-taxaDesconto);
		return aumentoSalario;
	}
	
	public String toString() {
		return nome + "$ " + salario ; 
	}

}
