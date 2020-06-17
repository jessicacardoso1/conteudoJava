package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//
/*Defaul Methods -> S�o metodos concretos implmentados em Interfaces.
Estes metodos, como sao concretos, ou seja, 
ja possuem implemenata��o, n�o precisao ser implementados
nas classes que implementarem esta interface.

 * Novidade implementada a partir da versao 8 do java
 * 
 * Atualmente estamos na vers�o 10
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
		
		//Collections.sort(palavras, comparador);// Ordena de forma alfab�tica
		palavras.sort(comparador);
		System.out.println(palavras);
	}
}
