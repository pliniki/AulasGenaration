package br.com.genaration.exerciciojava01;

import java.util.Scanner;

public class ExercicioJava05 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(nota1 < 0 || nota1> 10) {
			System.out.println("Nota invalida!");
		} else if (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota invalida");
		} else if(media >= 9 && media <= 10){
			System.out.println("Aprovado com Honra! Media: " + media);	
		} else if (media >= 6.0 && media <9.0) {
			System.out.println("Aprovado! Media: " + media);
		} else if (media >=3.0 && media < 6.0){
			System.out.println("Recuperacao! Media: " + media);
		} else {
			System.out.println("Reprovado! Media: " + media);
		}
	}

}
