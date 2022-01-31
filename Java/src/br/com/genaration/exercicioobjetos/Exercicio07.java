package br.com.genaration.exercicioobjetos;

public class Exercicio07 {
	public static void main (System[] args) {
	/*Crie uma classe paciente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto paciente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
		Paciente r1 = new Paciente();
		r1.recupera = "Recebeu alta";
		r1.recuperar();
		System.out.println(r1.recupera);
	}
}
