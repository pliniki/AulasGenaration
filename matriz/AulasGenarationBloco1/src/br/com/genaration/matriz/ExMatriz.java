package br.com.genaration.matriz;

import java.util.Scanner;

public class ExMatriz {

	public class ExercicioMatriz {

		  public static void main(System[] args) {
		  //Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		    Scanner read = new Scanner(System.in);
		    int[] numero = new int[2];
		    int maior = 0;
		    for (int i = 0; i < 2; i++) {
		      System.out.println("digite o valor :");
		      numero[i] = read.nextInt();
		    }
		    for (int i = 0; i < numero.length; i++) {
		      if (maior < numero[i]) {
		        maior = numero[i];
		      }
		      System.out.println("Maior valor: " + maior);
		    }
		  }
	}
}