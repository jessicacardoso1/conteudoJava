package br.com.geek.sessao21;

public class ListaLigada {
	private Celula primeira = null; //primeiro caso é null
	private Celula ultima = null;
	private int total = 0;
	
	/**
	 * Metodo que adiciona um objeto no começo da lista
	 * @param elemento
	 */
	public void adicionaNoComeco(Object elemento) {
		if (this.total == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else {
			Celula nova = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(nova); 
			this.primeira = nova;
		}	
		this.total = this.total + 1;
	}
	
	/**
	 * Metodo que adiciona um objeto no final da lista
	 * @param elemento
	 */
	public void adiciona(Object elemento) {
		if (total == 0) {
			this.adicionaNoComeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova); //Anterior aponta para novo.
			nova.setAnterior(this.ultima); //Nova.anterior vai apontar para ultima
			this.ultima = nova; //A ultima vai vai ser a nova
			this.total++; //incrimenta o total
			
		}

	}
	/**Metodo que adiciona um elemento no meio da lista de acordo com a posicao
	 * 
	 * @param posicao
	 * @param elemento
	 */
	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		}else if (posicao == this.total) {
			this.adiciona(elemento);
		}else {
			Celula anterior = this.pegaCelula(posicao - 1); // pego a posicao anterior
			
			Celula proxima = anterior.getProximo(); //nova
			
			Celula nova = new Celula(elemento, anterior.getProximo()); //pegando o proximo do anterior
			anterior.setProximo(nova); //anterior vai apontar para nova
			nova.setProximo(anterior); //novo
			proxima.setAnterior(anterior);
			this.total++;			
		}

	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeDoComeco();
		}else if (posicao == this.total-1) {
			this.removeDoFim();
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.total = total - 1;
		}
	}
	
	public void removeDoFim() {
		if (total == 1) {
			this.removeDoComeco();
		}else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null); //penultimo será p ultimo, n aponta p ngm
			this.ultima = penultima;
			this.total = total - 1;
		}
	}
	
	public void removeDoComeco() {
		if (this.total == 0 ) {
			throw new IllegalArgumentException("Lista Vazia");
		}
		this.primeira = this.primeira.getProximo();
		this.total = this.total - 1;
		
		if (this.total == 0) {
			this.ultima = null;
		}

	}
	
	
	public int tamanho() {
		return this.total;
	}
	
	public boolean contem(Object obj) {
		Celula atual = this.primeira;
		
		while (atual != null) {
			if (atual.getElemento().equals(obj)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}
	
	 @Override
	public String toString() {
		if (total == 0 ) {
			return "[]";
		}
		Celula atual = primeira; //pega  a lista
		StringBuilder builder = new StringBuilder("["); //abre os cochetes

		for (int i = 0; i < total; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
	 
	 private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.total;
	}
	 
	private Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inexistente");
		}
		
		Celula atual = this.primeira; //atual recebe a lista
		
		for (int i = 0; i < posicao; i++) { //varrendo ate achar a posicao do elemento
			atual = atual.getProximo();
		}
		return atual; //retorno o elemento
	
	 
	 
	 
	 
	 
}
