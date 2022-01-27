package br.com.genaration.exerciciojava01;

import java.util.Scanner;

public class ExerciciosJava02 {
	public static void main(String[] args) {
		
		double  an, mn, dn, mes, idade, dias, soma;
		Scanner numero = new Scanner(System.in);
		System.out.println("Quantos anos voce tem? \n");
		an = numero.nextInt();
	
		mes = 12;
		dias = 365;
		
		soma = (an / mes);
		idade = (soma * dias);
		
	
		System.out.println("\n Parabens! Voce tem " + soma + " meses ou " + idade + " dias de vida!");
	}
}


