package br.com.geek.sessao21;


public class Programa64 {
/*
 * Uma das características dos conjuntos é a nao aceitado
 * de elementos repetidos.
 * 
 * Gera perfomance.
 * 
 * A = ["Angelina", "Angela", "Adriano"...];
 * B = ["b", "bb", "bbb"...];
 * C = ["carlos", "cal", "carla"...];
 * D = ["dan", "d", "dd"...];
 * E = ["e", "ee", "eee"...];
 * F = ["F", "FF", "FFF"...];
 * .
 * .
 * .///;12 34
 * Z = ["Z", "ZA", "ZE"...];
 */
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		
		conjunto.adiciona("angelina");
		conjunto.adiciona("feliciti");
		conjunto.adiciona("GAbriela");
		conjunto.adiciona("FAbio");
		
		System.out.println(conjunto);
	}

}
