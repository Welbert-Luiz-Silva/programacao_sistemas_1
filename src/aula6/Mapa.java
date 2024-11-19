package aula6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		//ESTRUTURA CHAVE VALOR
		
		Map<Integer, String> mapa = new HashMap<>();
		
		mapa.put(1, "Pedro");
		mapa.put(2, "Maria");
		mapa.put(3, "Joao");
		mapa.put(4, "Carlos");
		mapa.put(5, "Ana");

		
		System.out.println("Tamanho: "+mapa.size());
		System.out.println("Chaves:  " +mapa.keySet());
		System.out.println("Valores: " +mapa.values());
		System.out.println("Chaves e valores: "+mapa.entrySet());
		
		//Caputurar um valor
		System.out.println("Indice: "+mapa.get(3));
		System.out.println("Chaves e valores: "+mapa.entrySet());
		
		//Retirar pelo índice
		System.out.println("Removendo: "+mapa.remove(3));
		System.out.println("Chaves e valores: "+mapa.entrySet());

		//Iterar pelas chaves
		for (int chave: mapa.keySet()) {
			System.out.println("Chave:" +chave);
		}
		
		//Iteração pelos valores
		for (String valor: mapa.values()) {
			System.out.println("Valores: "+valor);
		}
		
		//Iteração chaves e valores
		for(Map.Entry<Integer, String> entry: mapa.entrySet()) {
			Integer Key = entry.getKey();
			String val = entry.getValue();
			System.out.print("Key: "+Key);
			System.out.print(" - Valor: "+val);
			System.out.print(" / ");
			
		}
}
		
		
}
