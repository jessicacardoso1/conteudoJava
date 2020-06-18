package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.List;

public class Programa72 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");

		// FORMA 1
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			} else if (s1.length() > s2.length()) {
				return 1;
			} else {
				return 0;
			}
		});
		
		//FORMA 2
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		palavras.forEach(s -> System.out.println(s));
	}
}
