package PacoteJava;
import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[]args) {
		
		double n1,n2,n3;
		double notaFinal;
		Scanner ler = new Scanner (System.in);	
		
		System.out.println("insira a primeira nota: ");
		n1 = ler.nextDouble();
		
		System.out.println("insira a segunda nota: ");
		n2 = ler.nextDouble();
		
		System.out.println("insira a terceira nota: ");
		n3 = ler.nextDouble();
		
		notaFinal=((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println ("A média é: " + notaFinal);
		ler.close();
	}
	{
		
		
		
		
		
	}

	

}
