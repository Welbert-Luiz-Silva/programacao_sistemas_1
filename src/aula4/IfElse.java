package aula4;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 15;
		int B = 10;
		
		if (A > B)
			System.out.println("Valor A maior que valor B");
		else if (A < B)
			System.out.println("Valor A maior que valor B");
		else
			System.out.println("Valores iguais");
		
		
		// Leitura de dados
		
		Scanner sc = new Scanner(System.in);
		
		//Peso				
		System.out.print("Informe o seu peso em kg");
		double peso = sc.nextDouble();
		
		//Altura
		
		System.out.print("Informe a sua altura");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu imc é: " + imc);
		
		
		
		
		
		
		sc.close();
			
			
	}

}
