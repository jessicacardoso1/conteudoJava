package br.com.geek.sessao22;

public interface Teste {
	
	int valor = 9;
	
	public String mensagem();
	
	default void meu_metodo() {
		System.out.println("Meu defaul metodo");
	}
}
