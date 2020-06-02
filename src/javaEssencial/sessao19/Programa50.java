package br.com.geek.sessao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//Maps / MAP
/*
 * Os mapas sao representados em Java pela Interface Map
 * e mapeia seus elementos utilizando o conceito chave/valor
 *
 * Mapas sao conhecidos como se fossem/representassem 3 coleçoes:
 * 	-Coleçao de chaves;
 *  -Coleçao de valores;
 *  -colecoes de associacoes.
 */
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();

		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria");
		pessoas.put(41, "Joao");
		
		//Colecoes de chaves
		// System.out.println(pessoas.keySet);
		
		//Colecoes de valores
		System.out.println(pessoas.values());

		//Colecoes de associacoes
		System.out.println(pessoas.entrySet());
	
		//FORMA 1
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});		
		
		//FORMA 2
		//transforma em lista e depois faz o for
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		//Interar na colecao de valores
		
		//Forma 1
		Collection<String> valores = pessoas.values();
		for(String nome: valores) {
			System.out.println(nome);
		}
		
		//FORMA2
		//transforma em lista e depois faz o for
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		
		//Interar a colecao de associaçoes
		//transforma em lista e depois faz o for
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma 2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});

		
	} 

}
