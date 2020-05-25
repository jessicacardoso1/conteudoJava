//Objetos
/*
 * Objetos sao produtos/instancias da classe
 */
package teste;

public class Programa22 {

	public static void main(String[] args) {
		
		//Declarando e instanciando/inicializao do objeto
		//p1 .> Instancia do objeto ou um objeto
		Produto p0 = new Produto(); //construtor
		Produto p1 = new Produto(); //construtor
		//adicionando valores nos atributos;
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("Produtos");
		System.out.println(p1.nome);
		System.out.println("R$" + p1.preco);
		System.out.println(p1.desconto + "%");
		
		p0.nome = "Caneta bic";
		p0.preco =  2.45f;
		p0.desconto = 5;
		
		System.out.println("Produtos");
		System.out.println(p0.nome);
		System.out.println("R$" + p0.preco);
		System.out.println(p0.desconto + "%");
		
		Pessoa pessoa1 = new Pessoa(); //construtor
		pessoa1.nome = "Angelina jolie";
		pessoa1.email = "jolie@gmailcom";
		pessoa1.anonascimento = 1976;
		
		
		System.out.println("pessoas");
		System.out.println("Nome " + pessoa1.nome);
		System.out.println("E-mail " + pessoa1.email);
		System.out.println("Ano de Nascimento " + pessoa1.anonascimento);
	}

}
