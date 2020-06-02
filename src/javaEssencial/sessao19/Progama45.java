package br.com.geek.sessao19;
//Listas

import java.util.ArrayList;
import java.util.Collections;

/*Arrays
 *Arrays tem tamanhos fixos 
 *Tem um tipo de dado fixo.
 *é dificil encontrar um elemento, precisamos percorrer todos os elementos.
 * 
 * Collections (Coleçoes)
 * Java possui diversas calsses/interfaces que facilitam muito o trabalho quando s
 * se trata de coleçoes de dados. Essas classes/Interfaces sao chamadas de Collections 
 * 
 * 
 * Listas - 
 * 	Aceitam repetiçoes de valores
 * 	Possuem tamanho 'infinito' (depende da memoria)
 	Podemos adicionar valores de qualquer tipo, desde que nao especificamos um tipo na declaraçao
 	
 */
public class Progama45 {

	public static void main(String[] args) {
		//ArrayList nomes new ArrayList(); //sem definir o tipo de dado, podemos colocar qualquer tipo
		ArrayList<String> nomes = new ArrayList();
		
		nomes.add("jesssica");
		nomes.add("Maria");
		nomes.add("joao;");
		
//		nomes.add(11);
//		nomes.add(true);
		
		
		System.out.println(nomes.get(0));
		
		System.out.println(nomes.size());
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		Collections.sort(nomes); //ordenar a lista
		
		for (Object nome : nomes) {
			System.out.println(nome);
			
		}

	}

}
