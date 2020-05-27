package br.com.geek.sessao15;

//Atributos estáticos

/*
 * Atributos estaticos sao atributos onde os valores sao compartilhados
 *  entre as instancias da classe
 *  
 *  Para utilizar um atributo estatico, colocamos o nome da classe junto
 *   ao atributo.
 */
public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("jessica");
		
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("jessica");
		
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("joao");
		
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println(Conta.contador);
	}

}
