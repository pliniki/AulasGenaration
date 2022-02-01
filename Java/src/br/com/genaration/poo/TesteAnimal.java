package br.com.genaration.poo;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro();
		Cavalo horse1 = new Cavalo();
		Preguica preg = new Preguica();
		
		dog1.setSom("au-au");
		horse1.setSom("pocoto");
		preg.setSom("Zzzzz");
		
		System.out.println("O cachorro faz: " +dog1.getSom());
		System.out.println("O cavalo faz: " +horse1.getSom());
		System.out.println("A preguica faz: " +preg.getSom());
		
	}
	

}
