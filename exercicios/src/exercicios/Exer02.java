package exercicios;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double valorFinal = 0;
		
		System.out.print("Quantas ma??s? ");
		int qtdMacas = input.nextInt();
		
		if(qtdMacas >= 12) {
			valorFinal = qtdMacas * 0.25;
		} else {
			valorFinal = qtdMacas * 0.3;
		}
				
		System.out.print("O valor a ser pago ? R$ "+ valorFinal);
		input.close();

	}

}
