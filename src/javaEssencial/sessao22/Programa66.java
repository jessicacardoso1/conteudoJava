package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//
/*Defaul Methods -> São metodos concretos implmentados em Interfaces.
Estes metodos, como sao concretos, ou seja, 
ja possuem implemenatação, não precisao ser implementados
nas classes que implementarem esta interface.

 * Novidade implementada a partir da versao 8 do java
 * 
 * Atualmente estamos na versão 10
 */
public class Programa66 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");
		
		//Collections.sort(palavras, comparador);// Ordena de forma alfabética
		palavras.sort(comparador);
		System.out.println(palavras);
	}
}
