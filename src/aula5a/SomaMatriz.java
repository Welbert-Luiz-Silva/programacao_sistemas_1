package aula5a;

import java.util.Random;
import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanha da matriz: ");
		int tam = sc.nextInt();
		System.out.println("Tamanho da matriz  " + tam + 'x' + tam);
		
		int[][] matrizA = new int [tam][tam];
		int[][] matrizB = new int [tam][tam];
		
		//MatrizA		
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {	
				System.out.printf("MatrizA elementos: %dx%d da ", i, j);
				matrizA[i][j] = sc.nextInt();
			}
		}
		
		//MatrizB = Aleatória
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {	
				//System.out.printf("MatrizB elementos: %dx%d da ", i, j);
				matrizB[i][j] = random.nextInt()%10;
			}
		}
		
		int matrizSoma[][] = new int[tam][tam];
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {	
				matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		
		System.out.println("MatrizA");
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {
				System.out.print(" "+matrizA[i][j]);				
			}
			System.out.println();
		}
		
		System.out.println("MatrizB");
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {
				System.out.print(" "+matrizB[i][j]);				
			}
			System.out.println();
		}
		
		System.out.println("MatrizSoma");
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {
				System.out.print(" "+matrizSoma[i][j]);				
			}
			System.out.println();
		}
			
		sc.close();
		
	
	}

}
