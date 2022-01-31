package br.com.genaration.exercicioobjetos;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Crie uma classe produto eletrônico e apresente os atributos e métodos
		referentes esta classe, em seguida crie um objeto produto eletrônico,
		defina as instancias deste objeto e apresente as informações deste objeto
		no console.*/
		ProdutoEletronico p1 = new ProdutoEletronico();
		p1.desliga = "Geladeira";
		p1.liga = "Geladeira";
		
		p1.ligar();
		System.out.println(p1.liga);
		System.out.println();
		p1.desligar();
		System.out.println(p1.desliga);

	}

}
