package br.com.geek.sessao22;

//Lambdas
/*
Expressoes lambdas sao funcoes anonicas, ou seja, funçoes sem nome.
*Já sabemos que podemos utilizar expresoes lambdas com interfaces funcionais.
*
*Devemos entao criar uma funçao lambda compativel com a funçao da interface que estivermos
*utilizando.
*
*Por exemplo:
*
*- A interface consumer, possui um método que recebe uma string e nao retorna nada. Por isso
*foi possível utilizar a expressao lambdas que passa uma string como paramentro e nao retorna nada.
*
*- A funcao sort, espera receber dois paramentros do tipo string como entrada e retorna um 
*inteiro. Por isso foi possível passar a expressao lambda informando as duas strings, s e s2
*e utilizando a classe Integer.compare que retorna um inteiro.
*
*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("Amr");
		palavras.add("Blusa");
		palavras.add("Jessics");
		palavras.add("Oi");
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Recomendado
		palavras.forEach(s -> System.out.println(s));

		//Igual ao de cima
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);
	}

}
