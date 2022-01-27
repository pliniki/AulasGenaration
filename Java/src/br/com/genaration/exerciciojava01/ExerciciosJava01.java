package br.com.genaration.exerciciojava01;

import java.util.Scanner;

public class ExerciciosJava01 {
	public static void main(String[] args) {
		
		int  an, mn, dn, mes, idade, dias, soma;
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite o ano que voce nasceu: \n");
		an = numero.nextInt();
		System.out.println("\n Digite o mes que voce nasceu: \n");
		mn = numero.nextInt();
		System.out.println("\n Digite o dia que voce nasceu: \n");
		dn = numero.nextInt();
		
		mes = 12;
		dias = 365;
		int atual = 2022;
		int res;	
		soma = (an * mes);
		idade = (atual * mes);
		res = idade - soma;
	
		System.out.println("\n Parabens! Voce tem " + res + " meses e " + dn + " dias de vida!");
	}
}
