package exercicios;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n?mero: ");
		double num1 = input.nextDouble();
		System.out.print("Informe o segundo n?mero: ");
		double num2 = input.nextDouble();
		
		if(num1 > num2) {
			System.out.print("Primeiro n?mero ? maior: " + num1);
		} else if (num1 < num2) {
			System.out.print("Segundo n?mero ? maior: " + num2);
		} else {
			System.out.print("Os n?meros s?o iguais");
		}
		
		input.close();

	}

}
