package Exercicio8;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		System.out.print("Digite um n�mero:");
		numero = entrada.nextDouble();

		entrada.close();
		contador(numero);
	}
	
	//Fun��o 
	public static String contador(double numero) {
		String contador =  Double.toString(numero);
		System.out.print("A quantidade de d�gitos:" + contador.length());
		return contador;
	}
}
