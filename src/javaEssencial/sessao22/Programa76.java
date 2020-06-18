package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.List;

/*
 * Streams
 * 
 *Streams sao fluxos de daods/objetos utilizados para que possamos
 *trabalhar com esses dados de forma mais criteriosa.
 *
 *Quando trabalhamos com streams, os métodos aplicados a este stream 
 *nao afeta a coleçao original.
 */
public class Programa76 {
	
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
		
		// Como fazer para imprimir somente os cursos com mais de 100 alunos?
		// filtre em todos os cursos onde a quantidade de alunos seja maior ou igual a
		// 100
		// 1 - Transformando a coleçao de cursos em stream
		cursos.stream()
				// 2 - Aplicamos o filtro onde os cursos com 100 ou mais alunos
				.filter(c -> c.getAlunos() >= 100)
				// 3 - Imprimimos o resultado
				.forEach(c -> System.out.println(c.getNome()));

		// cursos.stream().filter(c -> c.getAlunos() >=
		// 100).forEach(System.out::println);	
	
	
	
	}
}
