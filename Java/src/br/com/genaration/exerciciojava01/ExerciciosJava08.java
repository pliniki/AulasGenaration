package br.com.genaration.exerciciojava01;

import java.util.Scanner;

public class ExerciciosJava08 {
	public static void main (System[] args ) {
		double carro, soma, custo, distribuidor, impostos, p;
		Scanner leia = new Scanner(System.in);
		System.out.println("Valor do carro: ");
		carro = leia.nextInt();
		
		p = (carro*100);
		distribuidor = 	p/carro;
		System.out.println("Dis:" + distribuidor);
		
	}

}
