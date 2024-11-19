package aula6;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
	
	public static void main(String[] args) {
		
		Set<String> participantesA = new HashSet<>();
		Set<String> participantesB = new HashSet<>();
		Set<String> participantesGeral = new HashSet<>();
		
		participantesA.add("maria");
		participantesA.add("jose");
		participantesA.add("pedro");
		participantesA.add("joao");
		
		System.out.println(participantesA);
		System.out.println("Tamanho: "+participantesA.size());
		System.out.println("Lista vazia: "+participantesA.isEmpty());
		System.out.println("Lista vazia: "+participantesB.isEmpty());

		
		participantesB.add("marcos");
		participantesB.add("augusto");
		participantesB.add("pedro");
		
		
		System.out.println(participantesB);
		System.out.println("Tamanho: "+participantesB.size());
		
		//Junção de listas (não repete elementos)		
		participantesGeral.addAll(participantesA);
		System.out.println(participantesGeral);
		participantesGeral.addAll(participantesB);
		System.out.println(participantesGeral);
		
		//Intercessão de elementos
		participantesA.retainAll(participantesB);
		System.out.println(participantesA);
		
		//Remoção de elementos da lista
		participantesA.remove("pedro");
		
		System.out.println(participantesA);
		System.out.println("Tamanho: "+participantesA.size());
		
	}

}
