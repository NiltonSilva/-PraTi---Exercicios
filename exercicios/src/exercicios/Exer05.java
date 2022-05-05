package exercicios;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double maiorValor = 0;
		double menorValor = 0;
		double numeroAtual = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			numeroAtual = input.nextDouble();
			if(i == 0) {
				maiorValor = numeroAtual;
				menorValor = numeroAtual;
			}
			if(numeroAtual > maiorValor) {
				maiorValor = numeroAtual;
			}
			if (numeroAtual < menorValor) {
				menorValor = numeroAtual;
			}
		}
		System.out.println("maior número: " + maiorValor);
		System.out.println("menor número: " + menorValor);
		input.close();

	}

}
