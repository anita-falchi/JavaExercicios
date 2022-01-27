package PacoteJava;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[]args) {
		double a, b, c, d, r, s;
		Scanner id = new Scanner(System.in);
		
		System.out.println("escreva um valor:");
		a=id.nextDouble();
		
		System.out.println("escreva outro valor:");
		b=id.nextDouble();
		
		System.out.println("escreva outro valor:");
		c=id.nextDouble();
		
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		d=(r+s)/2;
		
		System.out.println("O valor de D é: "+d);
		
		
		
		
		
	}

}
