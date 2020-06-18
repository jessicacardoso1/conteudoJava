package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Streams
//Indicado para milhoes/bilhoes de dados
public class Programa80 {
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
		
		/*List<Curso> resultado = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toList());
		resultado.forEach(System.out::println);*/
		
		cursos.parallelStream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(), //chave
					c -> c.getAlunos())) //valor
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
	}
}
