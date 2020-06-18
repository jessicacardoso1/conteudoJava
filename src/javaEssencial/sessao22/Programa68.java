package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");
		
		palavras.forEach(consumidor); // For each -> Para cada palavra

	}
}
