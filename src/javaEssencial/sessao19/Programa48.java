package br.com.geek.sessao19;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Conjuntos
 * 
 * Os conjuntos sao implementados com a interface Set, e uma das classes
 * que implementam esta interface é a HashSet
 * 
 * A maioria dos colecoes possuem os mesmos métodos ja conhecidos e
 * utilizados com a lista, mas o comppartamento desses objetos é um pouco
 * diferente.
 * 
 * A perfomance também é melhor em conjuntos do que em Listas.
 Caracteriscticas dos conjuntos:
 	- A ordem de insercao n é respeitada
 	- Nao aceitam valores repetidos
 	- Utiliza uma semi-ordenaçao
 	- n aceita ordenaçao
 	- n possui indices.
 */
public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1)+ "/5 nome" );
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome n pode ser repetido");
				i--;
			}
			
		}
		
		System.out.println("No conjunto nomes temos " + nomes.size() + "elementos");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
		/*
		nomes.add("maria");
		nomes.add("Angelina");
		nomes.add("joao");
		nomes.add("jessica");
		nomes.add("Angelina"); //conjuntos n aceitam repeticoao de valores e itens
		
		
		//System.out.println(nomes.size());
		
		//System.out.println(nomes.contains("Felicity")); //true or false 
		
		//Collections.sort(nomes); // n aceita ordenaçao
		
		for (String nome : nomes) {
			System.out.println(nome);
		}*/
	}

}
