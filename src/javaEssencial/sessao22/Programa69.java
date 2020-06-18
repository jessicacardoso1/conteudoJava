package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anonimas

/*
 * Classes anonimas sao classes sem nome
 * 
 * Quando utilizar?
 * 
 * Utilizamos classes anonimas quando temos interfaces com um ou poucos metodos
 * e nao precisamos reaporveitar o codigo da classe.
 * 
 * Ou seja, se nao iremos precisar reaproveirar a classe em outro lugar do nosso sistema e esta 
 * classe que eu deveria criar iria apenas implementar uma interface com um ou poucos métodos, 
 * podemos utilizar o conceito de classe anonima. 
 */
public class Programa69 {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");
		
		palavras.sort(comparador);
		
		//classe anonima. Nao estamos instanciando o objejeto da classe consumer, pois a mesma é uma interface
		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
				
			}
			
		};
		
		palavras.forEach(consumidor);
	}
}
