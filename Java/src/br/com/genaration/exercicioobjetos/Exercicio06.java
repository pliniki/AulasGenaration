package br.com.genaration.exercicioobjetos;

public class Exercicio06 {

	public static void main(String[] args) {
	/*Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console.*/
		ContaBancaria s1 = new ContaBancaria();
		s1.mostraSaldo = 5482.20;
		
		s1.saldo();
		System.out.println(s1.mostraSaldo);

	}

}
