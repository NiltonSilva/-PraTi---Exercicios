package exercicios;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int codigo = 1;
		while(codigo != 0) {
			System.out.print("Digite o código do aluno: ");
			codigo = input.nextInt();
			if(codigo == 0) {
				break;
			}
			double[] notas = new double[3];
			for(int i = 1; i <= 3; i++) {
				System.out.print("Digite a nota " + i + ": ");
				notas[i-1] = input.nextDouble();
			}
			double media = 0;
			for(int i = 0; i < 3; i++) {
				media += notas[i] / 3;
			}
			System.out.println("A média final é: " + media);
		}
		input.close();

	}

}
