package PacoteJava;
import java.util.Scanner;

public class exercicio8 {
	public static void main (String[] args) {
	
		double precoFab, precoFinal;
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Valor do carro sem impostos:");
		precoFab=ler.nextDouble();
		
		precoFinal=(precoFab*0.73)+precoFab;
		
		System.out.print("o valor do carro com impostos é: " + precoFinal);
		ler.close();
		
	}
		

	

}
