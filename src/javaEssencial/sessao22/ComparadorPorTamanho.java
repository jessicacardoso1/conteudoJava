package br.com.geek.sessao22;
/*
 * A gente esta criando nosso próprio comparador de objetos (Strings)
 * para que seja possivel, desta forma, ordernar a string p0elo seu tamanho
 * ao invés de orem alfabética.
 * 
 * 
 * 1- A string1 é menor que a string 2 -> retornamos -1
 * 2- A string1 é maior que a string2 -> retorna 1
 * 3- A string1 tem o mesmo tamanho da string2 -> retornamos 0
 */
import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}else if (s1.length() > s2.length()) {
			return 1;
		}else {
			return 0;
		}
	}

}
