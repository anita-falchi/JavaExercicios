package PacoteJava;

import java.util.Scanner;

public class exercicio2 
{
	public static void main (String[] args)
	{
	Scanner ler = new Scanner(System.in);
				{
			int ano, mes, dia, dias;
			System.out.println("quantos dias de vida voce tem?");
			dias = ler.nextInt();
			
			ano = dias/365;
			mes = dias%365/30;
			dia = dias%365/30;
			
			System.out.println("voce tem "+ano+ " anos, " +mes+" meses e "+dia+
					" dias de vida.");
			
			
				}
				
	}

}
