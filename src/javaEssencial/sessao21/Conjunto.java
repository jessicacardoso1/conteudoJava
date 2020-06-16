package br.com.geek.sessao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>(); 
	
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}
	public void adiciona(String nome) {
		//Verifica se o nom n�o existe na lista
		if (!contem(nome)) {
			//1 Calculando o indice no nome
			int indice = calculaIndice(nome);
			//2 Pegando a lista de acordo com o indice 
			List<String> lista = tabela.get(indice);
			//3 Adiciona o nome na lista correta
			lista.add(nome);
		}
		
		
	}
	public boolean contem(String nome) {
		//1 Calculando o indice no nome
		int indice = calculaIndice(nome);
		//2 Buscamos na tabela especifica do �ndice o nome
		return tabela.get(indice).contains(nome);
	
	}
	
	public void remove(String nome) {
		// 1 Verificamos se o nome existe em alguma lista
		if (contem(nome)) {
			//2 Calculamos o indice do nome
			int indice = calculaIndice(nome);
			List<String> lista = tabela.get(indice);
			//4 Removendo o nome da lista
			lista.remove(nome);
		
		}

	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
}
