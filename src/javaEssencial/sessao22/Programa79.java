package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {
		// É UMA LISTA DE CURSOS
		List<Curso> cursos = new ArrayList<Curso>();

		// criei uma classe anonima
		cursos.add(new Curso("curso1", 1));
		cursos.add(new Curso("curso32", 11));
		cursos.add(new Curso("curso23", 2111));
		cursos.add(new Curso("curso21", 213));
		cursos.add(new Curso("curso11", 312));
		cursos.add(new Curso("curso3", 332));

		cursos.stream()
			.filter(c -> c.getAlunos() < 100)
			//.findAny() //pega qualquer um de acordo com o filtro
			.findFirst() //pega o primeiro
			.ifPresent(System.out::println); //se encontrar, imprima
	}

}
