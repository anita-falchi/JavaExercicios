package PacoteJava;

import java.util.Scanner;

public class exercicio1 {
	public static void main (String srgs[])
	{
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia, total;
		System.out.println("quantos anos voce tem? ");
		ano = ler.nextInt();
		
		System.out.println("Qual o dia do seu aniversario? ");
		dia = ler.nextInt();
		
		System.out.println("quantos meses se passaram desde o seu ultimo aniversario? ");
		mes = ler.nextInt();
		
		total = (ano*365)+(mes*30)+(dia);
		
		System.out.println("sua idade em dias é "+total);
		

		
	}

}
