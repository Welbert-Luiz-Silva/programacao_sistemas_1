package aula5a;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanha da matriz: ");
		int tam = sc.nextInt();
		System.out.println("Tamanho da matriz  " + tam + 'x' + tam);
		
		int[][] matriz = new int [tam][tam];
		
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {		
				//Elementos da diagonal
				if (i==j) {
					matriz[i][j]=0;					
				}
				if (i<j) {
					//Elementos acima
					System.out.printf("Digite o valor de: %dx%d", i, j);
					matriz[i][j] = sc.nextInt();
					//Espelho de elementos
					matriz[j][i] = matriz[i][j];
				}
			}
		}
		
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {
				System.out.print(" "+matriz[i][j]);				
			}
			System.out.println();
		}
			
		sc.close();
		
	}

}
