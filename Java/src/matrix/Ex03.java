package matrix;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra:
	    // 10-14 infantil
	    // 15-17 juvenil
		// 18-25 adulto
		
		Scanner read = new Scanner(System.in);
		int age;
		
			System.out.println("digite a idade: ");
			age = read.nextInt();
		
		    if(age < 10 && age > 25) {
				System.out.println("Idade nao permitida!");
			} else if (age > 18 && age < 25) {
				System.out.println("Adulto");	
		    } else if (age > 15 && age < 18) {
				System.out.println("Juvenil");	
		    } else if (age > 10 && age < 15) {
				System.out.println("Juvenil");	
		    }		
	    
	}

}
