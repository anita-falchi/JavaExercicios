package HerançaPolimorfismo;

import java.util.ArrayList;
import java.util.Collections;


public class EstoqueLoja {
	public static void main (String[]args) {
		
		Estoque loja1 = new Estoque ("Tenis ", "esportivo ", 38);
		Estoque loja2 = new Estoque ("Bota ", "neve ", 42);
		Estoque loja3 = new Estoque ("Chinela ", "casual ", 33);
		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		//armazenando dados 
		estoque.add(loja1);
		estoque.add(loja2);
		estoque.add(loja3);
		
		System.out.println(estoque);
		
		//removendo dados da lista
		estoque.remove(0); 
		System.out.println(estoque);
		
		//atualizar conteudo
		estoque.set(0, loja3);
		System.out.println(estoque);
		
			
		
		
		
		
	}
	
	
	
	

}
