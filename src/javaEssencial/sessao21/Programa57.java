package br.com.geek.sessao21;
//Lista Ligada/ linked list

/*
 * Em um vetor, os elemebros estao um do lado do outro, enquanto em uma lista
 * ligada, eles estao em lugares diferentes. prém um aponta para o outro
 * indicando o próximo elemento.
 * 
 *  [0][3][1][2][4]
 * 
 */
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Maria");
		System.out.println(lista);
		lista.adicionaNoComeco("Joana");
		System.out.println(lista);
		lista.adicionaNoComeco("jessica");
		System.out.println(lista);
	}

}
