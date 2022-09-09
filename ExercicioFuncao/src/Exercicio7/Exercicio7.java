package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double prestacao= 0;
		System.out.print("Digite o valor da prestacao:");
		prestacao = entrada.nextDouble();
		
		double dia= 0;
		System.out.print("Digite o número de dias em atraso:");
		dia = entrada.nextDouble();
		
		entrada.close();
		valorPagamento(prestacao,dia);
	}
	public static double valorPagamento(double prestacao, double dia) {
		return  (prestacao*1.03 + 0.001*dia);
	}

}
