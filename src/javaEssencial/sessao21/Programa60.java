package br.com.geek.sessao21;
/*
 * 
 Sao estruturas de dados onde o elemento que está visivil/disponivel é o que
 esta sempre ao topo.
 
 Os elementos, ao serem adicionados em uma pilha, sao adicionados sempre no topo.
 
 Para remover elemetos da pilha só podemos remover o topo
 */


public class Programa60 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.Insere("Anjelina");
		pilha.Insere("joao");
		
		System.out.println(pilha);
		
		String ret = pilha.Pegatopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha.vazia());
		
		
	}

}
