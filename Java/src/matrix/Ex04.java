package matrix;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.
		
		Scanner read = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero inteiro: ");
		num = read.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O numero: " + num + " e par!");
		} else {
			System.out.println("O numero: " + num + " e impar!");
		}
		
	}

}
