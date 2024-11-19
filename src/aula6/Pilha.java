package aula6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		//LIFO
		
		Deque<String> Livros = new ArrayDeque<String>();
		Livros.add("O mundo de Sofia"); //exception, lança no final
		Livros.add("A estrela sobe");
		Livros.add("O Alienista");
		
		System.out.println(Livros);
		System.out.println(Livros.size());
		System.out.println(Livros.isEmpty());
		System.out.println("Topo da fila: "+Livros.peek()); //Identifica o topo da lista
		System.out.println("Base da fila: "+Livros.peekLast()); //Identifica a base 
		
		Deque<String> LivrosA = new ArrayDeque<String>();
		LivrosA.push("O mundo de Sofia"); //null, adiciona do topo (deve ser utilizado em pilhas
		LivrosA.push("A estrela sobe");
		LivrosA.push("O Alienista");
		System.out.println(LivrosA);
		System.out.println(LivrosA.size());
		System.out.println(LivrosA.isEmpty());
		System.out.println("Topo da fila: "+LivrosA.peek()); //Identifica o topo da lista
		System.out.println("Base da fila: "+LivrosA.peekLast()); //Identifica a base 
		
		//Desempilhar
		System.out.println("Retirado: "+LivrosA.poll()); //Remove e apresennta o elemento retirado
		System.out.println("Retirado: "+LivrosA.poll()); //NUll
		System.out.println("Retirado: "+LivrosA.remove()); //Remove e lança exception
//		System.out.println("Retirado: "+LivrosA.remove()); //Remove e lança exception
		System.out.println("Retirado: "+LivrosA.poll()); //NUll
		
	}

}
