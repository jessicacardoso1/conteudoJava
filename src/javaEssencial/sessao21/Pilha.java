package br.com.geek.sessao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();
	/**
	 * Em uma pilha, inserimos sempre no topo;
	 * @param nome
	 */
	public void Insere(String nome) {
		this.nomes.add("jessica");
	}
	
	public String remove() { 
		return this.nomes.remove(nomes.size() -1);
	}
	
	public String Pegatopo() {
		return nomes.get(nomes.size() - 1);
	
	}
	
	public boolean vazia() {
		return nomes.size() == 0;
 	}
	@Override
	public String toString() {
		return this.nomes.toString();
	}
	
	
}


