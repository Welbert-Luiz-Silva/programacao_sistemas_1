package aula5a;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double[] vetorA = {10, 8, 5, 4, 7, 6, 1, 3};
		double[] vetorI = new double[vetorA.length];
		double soma=0;
		double media=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("Pos %d : %.2f\n", i, vetorA[i]);
			soma += vetorA[i];
			
			vetorI [vetorI.length -1 -i] = vetorA[i];
		}
		media = soma /vetorA.length;
		

		System.out.println("Valor da Soma: " + soma);
		System.out.printf("Valor da média: %.2f \n", media);
		
		System.out.println("Vetor Invertido");
		
		for(int i=0; i<vetorI.length; i++) {
			System.out.println("Pos " + i + " : " + vetorI[i]);
		}
		
				
		
	}

}
