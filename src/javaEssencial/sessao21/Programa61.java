package br.com.geek.sessao21;

import java.util.Stack;

//Piçhas - Implementaçao Java.
public class Programa61 {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
	
		
		nomes.push("jessica");
		nomes.push("joao");
		nomes.push("falsa");
		System.out.println(nomes); //Insere
		
		String ret = nomes.peek();
		System.out.println(ret);
		System.out.println(nomes);
		
		String r1 = nomes.pop(); //remove
		System.out.println(r1);
		System.out.println(nomes);
	}

}
