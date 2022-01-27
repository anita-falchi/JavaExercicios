package PacoteJava;
import java.util.Scanner;


public class exercicio3 {
	public static void main(String[] args) {
        
        
        Scanner ler = new Scanner (System.in);
        {
            int seg, min, hora, tempo;

        
        System.out.println("Escreva os segundos sem ocorrencia: ");
        tempo=ler.nextInt();

        hora = tempo/3600;
        min = (tempo-(3600))/60;
        seg =  (tempo-(3600))%60;

        System.out.println("\nO tempo"+hora+"horas \nminutos"+min+"e"+seg+"segundos");
                        }
	}
}
