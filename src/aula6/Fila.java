package aula6;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		//FIFO
		
		Queue<String> atendimento = new LinkedList<>();
		
		atendimento.add("maria"); // Se cheia lança um boolean
		atendimento.add("jose");
		atendimento.add("pedro");
		atendimento.offer("joao"); //se cheia lança uma exceção
		atendimento.offer("ricardo");
		atendimento.add("roberto");
		
		System.out.println(atendimento);
		
		//Verificar o 1o. da fila
		System.out.println("Quem é o 1o. da Fila: " +atendimento.peek()); //Se vazio retorna nullo
		System.out.println("Quem é o 1o. da Fila: " +atendimento.element()); //Se vazio lança exceção
		
		//Retirar e apresentar o elemento
		System.out.println(atendimento.poll()); //null
		System.out.println(atendimento.poll());
		System.out.println(atendimento.remove()); //exception
		System.out.println(atendimento.remove());
//		System.out.println(atendimento.remove());
//		System.out.println(atendimento.remove());
//		System.out.println(atendimento.remove());
		
		atendimento.clear();
		System.out.println(atendimento);
		
		
	}

}
