package br.com.genaration.exercicioobjetos;

public class Exercicio01 {

	public static void main(String[] args) {
	/*Crie uma classe clientes e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
		
		clientes c1 = new clientes();
		c1.comprando = "Blusa";
		c1.pagando = 200;
		
		c1.comprar();
		System.out.println(c1.comprando);
		System.out.println();
		c1.pagar();
		System.out.println(c1.pagando);
	}
}
