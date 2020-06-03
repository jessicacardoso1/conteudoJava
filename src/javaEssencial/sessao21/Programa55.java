package br.com.geek.sessao21;
//Armazenamento Sequencial

/*
 *
 */

public class Programa55 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Joao");
	
		
		Vetor lista = new Vetor();
		
		System.out.println("total de alunos" + lista.tamanho());	
		lista.adiciona(a1);
		
		System.out.println("total de alunos" + lista.tamanho());
		lista.adiciona(a2);
		
		System.out.println("total de alunos" + lista.tamanho());
		
		System.out.println(lista.contem(a2));
		try {
		System.out.println(lista.pega(101));
		}catch(IllegalArgumentException e){
			System.out.println("O aluno da posiçao 101 nao existe");
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Maria");
		try {
			lista.adiciona(1, a3);
		} catch (IllegalArgumentException e) {
			System.out.println("A posicao é inválida");
		}
		
		lista.remove(0);
		System.out.println(lista); //imprime o toString
	
	
	}
}
