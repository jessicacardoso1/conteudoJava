package br.com.geek.sessao22;
/*
 * Mehod References
 * 
 * Podem ser consideradas simplificaçoes das expressoes lambdas.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Programa74 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");
		
		//Vai receber uma string e vai retornar um inteiro
		//Compare cada string pelo seu length
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//FORMA 1
		palavras.sort(Comparator.comparing(String::length));
		
		//FORMA 2
		//Function<String, Integer> tamanho = String::length; //Usando Method References
		Function<String, Integer> tamanho = s -> s.length(); //Usando expressao Lambda
		Comparator<String> comparador = Comparator.comparing(tamanho); 
		palavras.sort(comparador);
		
		//System.out.println(palavras);
		
		//para cada palavra manda ela para o println
	 	palavras.forEach(System.out::println);  //Usando Method References 

	}

}
