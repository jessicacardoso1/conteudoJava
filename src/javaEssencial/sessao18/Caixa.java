package br.com.geek.sessao18;


/*
 * Caixa de objetos genéricos
 * 
 */
public class Caixa {
	private Object[] objetos; //Criando um array de contas
	private int posicaoLivre;
	
	public Caixa() {
		objetos = new Object[100]; // até 100 contas.
		posicaoLivre = 0;
	}
	
	public void adicionar(Object nova) {
		objetos[posicaoLivre] = nova;
		posicaoLivre++;

	}
	
	public Object pegar(int posicaoInformada) {
		return this.objetos[posicaoInformada];
	}

}
