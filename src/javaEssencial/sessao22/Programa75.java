package br.com.geek.sessao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 /*
  * Revisao
 	Classes anonimas
 	Lambdas
 	Method References
  */
public class Programa75 {
	
	public static void main(String[] args) {
		//É UMA LISTA DE CURSOS
		List<Curso> cursos = new ArrayList<Curso>();
		
		//crei uma classe anonima
		cursos.add(new Curso("curso1", 1));
		cursos.add(new Curso("curso32", 11));
		cursos.add(new Curso("curso23", 2111));
		cursos.add(new Curso("curso21", 213));
		cursos.add(new Curso("curso11", 312));
		cursos.add(new Curso("curso3", 332));
		
		System.out.println(cursos);
		//orodenando de acordo com o tamanho
		//cursos.sort(Comparator.comparing(c -> c.getAlunos())); //Lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //Method References
		
		//cursos.forEach(c -> System.out.println(c.getNome())); //Lambda
		cursos.forEach(System.out::println);//Method References
	}
}
