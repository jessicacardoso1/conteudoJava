package br.com.geek.sessao21;
/*
 * Classe que representa uma c�lula(container)
 * teremos o objeto(valor) e uma celula que ser� a 
 * liga�ao para o outro elemento.
 */
public class Celula {
	private Object elemento; //object para deixar aberto para receber qualquer tipo de dados.
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
				
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
	
}
