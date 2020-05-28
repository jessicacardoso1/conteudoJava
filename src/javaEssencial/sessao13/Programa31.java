package br.com.geek.sessao13;

import br.com.geek.sessao12.Aluno;

/*
 * Classes abstratas
 * 
 * É um recurso que proporciona um bloqueio na criaçao do objetos;
 *Nao consiguimos instanciar objetos de uma classe abstrata.
 *
 *Metódos abstratos:
 *Sao metodos que nao possuem implementacao, possuem apenas
 *declaracao, e obrigatoriamente as classes que herdarem desta 
 *classe com métodos abstratos, precisam implementar estes metodos.
 *
 *
 *
 */

public class Programa31 {
	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria", 1111, "maria@gmailcom", "123456");
		maria.outraMensagem("meu nome é" + maria.getNome());
	}
}
