package br.com.geek.sessao15;
//Metodos estáticos

/*
 * Um metodo estático, nao depende de uma instancia da classe
 * para ser utilizado.
 * 
 * 
 * Pode se utilizar conforme:
 * 
 * NomeDaClasse.metodo();
 * */
public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu Cliente");
		
		System.out.println("Numero da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		System.out.println("A proxima conta será" + Conta.proximaConta()); //utilzando o metodo statico que nao precisa instaciar para utilizar ele
		

	}

}
