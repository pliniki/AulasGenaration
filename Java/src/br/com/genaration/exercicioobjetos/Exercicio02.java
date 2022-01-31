package br.com.genaration.exercicioobjetos;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/*Crie uma classe avião e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto avião, defina as instancias deste
		bjeto e apresente as informações deste objeto no console.*/
			
		Aviao v1 = new Aviao();
		v1.voa = "no ceu";
			
		v1.voar();
		System.out.println(v1.voa);
		}
}
