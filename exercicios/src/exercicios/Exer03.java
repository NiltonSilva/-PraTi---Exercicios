package exercicios;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double salarioBruto = 0;
		double salarioLiquido = 0;
		
		System.out.print("Informe o valor do sal�rio bruto: ");
		salarioBruto = input.nextDouble();
		
		if(salarioBruto < 1100) {
			salarioLiquido = salarioBruto * 0.94;
		} else if (salarioBruto <= 2500) {
			salarioLiquido = salarioBruto * 0.92;
		} else if (salarioBruto <= 4800) {
			salarioLiquido = salarioBruto * 0.9;
		} else {
			salarioLiquido = salarioBruto * 0.85;
		}
		
		System.out.println("O sal�ro l�quido do funcion�rio � R$ " + salarioLiquido);
		input.close();

	}

}
