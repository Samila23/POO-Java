// Fazer um programa para ler os valores da largura e altura de um retângulo. 
//Em seguida, mostrar na tela o valor de sua área, perimetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
// Area() : double
// Perimetro () : double
// Diagonal () : double

// Entradas para teste
//3.00
//4.00
//area 12.00
//Perimetro : 14.00
//Diagonal : 5.00

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a Largura e altura do retangulo, "
				+ "na respectiva ordem");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf( "%.2f%n", retangulo.area());
		System.out.printf( "%.2f%n", retangulo.perimetro());
		System.out.printf( "%.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
// Classe Rectangle.java (pacote entities):

package entities;

public class retangulo {
	public static double largura;
	public static double altura;
	
	public static double area() {
		double area = (largura * altura);
		return area;
	}
	public static double perimetro() {
		double perimetro = (2 * (largura + altura));
		return perimetro;
	}
	public static double diagonal() {
		double x = ((largura * largura ) + (altura * altura));
		double diagonal = Math.sqrt(x);
		return diagonal ; 
	}
}
