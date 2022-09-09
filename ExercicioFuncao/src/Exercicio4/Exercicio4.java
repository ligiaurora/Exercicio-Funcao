package Exercicio4;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero= 0;
		System.out.print("Digite o valor de um número:");
		numero = entrada.nextDouble();
		
		System.out.println(numero);	
		System.out.println(funcao4.letras(numero));

		entrada.close();
		
		
	}
}
