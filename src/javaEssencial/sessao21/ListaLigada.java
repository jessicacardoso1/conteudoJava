package br.com.geek.sessao21;

public class ListaLigada {
	private Celula primeira = null;
	private int total = 0;
	
	public void adicionaNoComeco(Object elemento) {
		//[42] -> null
		Celula nova = new Celula(elemento, this.primeira);
		this.primeira = nova;

		this.total = this.total + 1;
	}
	
	
	public void adiciona(Object elemento) {
		// TODO Auto-generated method stub

	}
	
	public void adiciona(int posicao, Object elemento) {
		// TODO Auto-generated method stub

	}
	
	public Object pega(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void remove(int posicao) {
		// TODO Auto-generated method stub

	}
	
	
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean contem(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	 @Override
	public String toString() {
		if (total == 0 ) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < total; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
}
