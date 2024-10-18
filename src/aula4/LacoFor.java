package aula4;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com valor de somas sucessivas");
		//int valor = sc.nextInt();
		//int somatorio = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.println("Tabuada do " + i);			
			
			
			for (int j=1; j<=10; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));	
				
				
				
				
			}
		}
				
		
		
		
		
		sc.close();
		
		
		
		
	}

}
