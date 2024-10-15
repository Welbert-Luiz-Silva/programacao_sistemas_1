package Aula3;

import java.util.Scanner;

public class interacaoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Digite a sua altura: (ex. 1,75): ");
		float altura =sc.nextFloat();
		
		System.out.printf("Ola, %s, sua idade é %d anos, e você mede %2f metros", nome, idade, altura);
		
		sc.close();
		
		
		
		
		

	}

}
