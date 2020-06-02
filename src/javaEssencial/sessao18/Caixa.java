package br.com.geek.sessao18;

import br.com.geek.sessao11.Conta;

/*
 * 
 * 
 */
public class Caixa {
	private Conta[] contas; //Criando um array de contas
	private int posicaoLivre;
	
	public Caixa() {
		contas = new Conta[100]; // até 100 contas.
		posicaoLivre = 0;
	}
	
	private void adicionar(Conta nova) {
		contas[posicaoLivre] = nova;
		posicaoLivre++;

	}
	
	private Conta pegar(int posicaoInformada) {
		return this.contas[posicaoInformada];
	}

}
