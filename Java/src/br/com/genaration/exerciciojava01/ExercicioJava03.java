package br.com.genaration.exerciciojava01;

import java.util.Scanner;

public class ExercicioJava03 {

	public static void main(String[] args) {
		double s, h, m, segundos, minutos, horas;
		m = 60;
		s = 3600;
		Scanner numero = new Scanner(System.in);
		System.out.println("Duracao do evento em horas: ");
		h = numero.nextInt();
		
		segundos = s * numero.nextInt();
		minutos = m * numero.nextInt();
		horas = h;		
		
		System.out.println("Evento em segundos: " + segundos);
		System.out.println("Evento em minutos: " + minutos);
		System.out.println("Evento em horas: " + horas);
		

	}

}
