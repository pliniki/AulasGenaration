package matrix;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
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
