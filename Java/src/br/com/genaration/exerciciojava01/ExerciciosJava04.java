package br.com.genaration.exerciciojava01;

import java.util.Scanner;

public class ExerciciosJava04 {
	public static void main (System[] args) {
		
		int A,B,C;
		double R,S,D;		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro e positivo: ");
		A = numero.nextInt();
		System.out.println("Digite o segundo numero inteiro, positivo: \n");
		B = numero.nextInt();
		System.out.println("Digite o terceiro numero inteiro, positivo: \n");
		C = numero.nextInt();
		
		R = Math.pow(A+3,2);
		double raiz;
		S = Math.pow(B+C,2);
		raiz = (R + S) / 2 ;		
		
		System.out.println("Raiz: " + raiz);
		System.out.println("Potencia: " + R);
		
		
	}

}
