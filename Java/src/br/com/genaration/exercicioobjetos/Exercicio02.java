package br.com.genaration.exercicioobjetos;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
		esta classe, em seguida crie um objeto avi�o, defina as instancias deste
		bjeto e apresente as informa��es deste objeto no console.*/
			
		Aviao v1 = new Aviao();
		v1.voa = "no ceu";
			
		v1.voar();
		System.out.println(v1.voa);
		}
}
