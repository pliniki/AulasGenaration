package br.com.genaration.exercicioobjetos;

public class Exercicio04 {
	public static void main(String[] args) {
		/*Crie uma classe funcionário e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto funcionário, defina as
		instancias deste objeto e apresente as informações deste objeto no
		console.*/
			
		Funcionario t1 = new Funcionario();
		t1.trabalha = "trabalhando no escritorio";	
		t1.trabalho();
		System.out.println(t1.trabalha);
		}
}
