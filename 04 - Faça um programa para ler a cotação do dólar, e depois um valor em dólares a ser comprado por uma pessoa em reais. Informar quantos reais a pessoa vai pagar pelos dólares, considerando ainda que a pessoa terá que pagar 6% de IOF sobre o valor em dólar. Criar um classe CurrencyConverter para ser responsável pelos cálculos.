// Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
//Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. 
//Criar um classe CurrencyConverter para ser responsável pelos cálculos.


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.calculadora_dolar;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Digite o valor atual do dolar");
		calculadora_dolar.dolar = sc.nextDouble();
		System.out.println(" Digite o valor em doláres que deseja comprar");
		calculadora_dolar.ValorDolar = sc.nextDouble();
		System.out.print(calculadora_dolar.conversor());
		sc.close();
	}

}

package entities;

public class calculadora_dolar {
	public static double dolar ;
	public static double ValorDolar ; 
	public static double TaxaAcrescimo = 6;
	
	public static double conversor() {
		double ValorTaxaAplicadaDolar = (((ValorDolar * TaxaAcrescimo) / 100));
		double ValorEmReais = (ValorDolar +  ValorTaxaAplicadaDolar) * dolar ;
		return ValorEmReais;
				
	}
}
