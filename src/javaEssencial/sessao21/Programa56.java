package br.com.geek.sessao21;

public class Programa56 {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor();
		
		for (int i = 0; i < 300; i++) {
			Aluno a = new Aluno("Maria" + 1);
			lista.adiciona(a);
		}
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}
