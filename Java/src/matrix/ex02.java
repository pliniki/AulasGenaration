package matrix;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner read = new Scanner(System.in);
		int[] numero = new int[3];
		int a;
		for(int i = 0; i < 3; i++ ) {
			System.out.println("digite o valor :");
			numero[i] = read.nextInt();
		}
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				if (numero[i] < numero[j]) {
					a = numero[i];
					numero[i] = numero[j];
					numero[j] = a;
				}
			}
		}	
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}

	}
}
