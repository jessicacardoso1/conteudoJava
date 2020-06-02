package br.com.geek.sessao18;
/*
 * Trabalhando com Stringa
 * 
 * Em Java, Strings sao imutaveis, ou seja, nao mudam.
 */
public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programacao em Java Essencial";
		
		//curso.replace("java", "python"); // Nao altera.
		curso = curso.replace("java", "python"); // Altera.
		System.out.println(curso);
		
		curso = curso.toLowerCase();
		System.out.println(curso);
		
		curso = curso.toUpperCase();
		System.out.println(curso);
		
		System.out.println(curso.charAt(12));
		
		for (int i = 0; i < curso.length(); i++) {
			System.out.print(curso.charAt(i));
		}
		
		for (int i = (curso.length() - 1); i <= 0; i--) {
			System.out.print(curso.charAt(i));
		}

	}

}
