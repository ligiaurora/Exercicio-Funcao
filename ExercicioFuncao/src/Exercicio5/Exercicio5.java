package Exercicio5;
import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
			
	Scanner entrada  = new Scanner(System.in);
	
	double porcentagem = 0;
	System.out.print("Digite o valor da porcentagem:");
	porcentagem = entrada.nextDouble();
	
	
	double produto = 0;
	System.out.print("Digite o valor do produto");
	produto = entrada.nextDouble();
	
	System.out.println("Valor com imposto:" + Funcao5.somaImposto(porcentagem,produto));
	entrada.close();
	}
}
