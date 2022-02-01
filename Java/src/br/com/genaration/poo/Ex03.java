package br.com.genaration.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 extends Estoque{
	
	public static void main(System [] args) {
		Scanner ler = new Scanner(System.in);
		Estoque pdt1 = new Estoque();
		// usando o método add() para gravar 4 produtos no estoque
	    pdt1.setProduto("tenisNike");
	    pdt1.setQtd(2);
	    
	    
	   for (int i = 0 ; i <=10; i++) {
		   System.out.println("Digite o nome do produto que deseja armazenar: ");
	   }	   
	   
}
}