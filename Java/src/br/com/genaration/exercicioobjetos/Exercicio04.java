package br.com.genaration.exercicioobjetos;

public class Exercicio04 {
	public static void main(String[] args) {
		/*Crie uma classe funcion�rio e apresente os atributos e m�todos
		referentes esta classe, em seguida crie um objeto funcion�rio, defina as
		instancias deste objeto e apresente as informa��es deste objeto no
		console.*/
			
		Funcionario t1 = new Funcionario();
		t1.trabalha = "trabalhando no escritorio";	
		t1.trabalho();
		System.out.println(t1.trabalha);
		}
}
