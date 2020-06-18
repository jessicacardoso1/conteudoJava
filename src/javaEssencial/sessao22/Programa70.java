package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa70 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");
		
		palavras.sort(comparador);
		
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
				
			}
		});
	}

}
