package br.com.genaration.exercicioobjetos;

public class Exercicio05 {
	/*Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	public static void main(System[] args) { 	
	Patinete pt1 = new Patinete();
	pt1.patina = "Patinar na pixta";
		
	pt1.patinar();
	System.out.println(pt1.patina);
	}

}
