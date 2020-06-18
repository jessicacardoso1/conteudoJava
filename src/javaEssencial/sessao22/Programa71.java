package br.com.geek.sessao22;

//Lambdas
/*Expressoes lambdas, sao funçoes anonimas .
 * 
 * CTRL + SHIF + F - IDENTAÇAO
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");

		palavras.sort(comparador);

		// quando tem essa seta é uma expressao lambda
		// FORMA 1
		// palavras.forEach((String s) -> {
		// System.out.println(s);
		// });

		// FORMA 2
		// dentro de palavras, para cada string chama ela de s e imprime s
		palavras.forEach(s -> System.out.println(s));

	}		

}
