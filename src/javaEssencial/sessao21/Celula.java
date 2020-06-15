package br.com.geek.sessao21;
/*
 * Classe que representa uma célula(container)
 * teremos o objeto(valor) e uma celula que será a 
 * ligaçao para o outro elemento.
 */
public class Celula {
	private Object elemento; //object para deixar aberto para receber qualquer tipo de dados.
	private Celula proximo;
	private Celula anterior;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
				
	}
	
	public Celula(Object elemento) {
		this(elemento, null);
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
}
