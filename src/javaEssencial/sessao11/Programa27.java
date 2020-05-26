package br.com.geek.sessao11;

/*
 * Privado � pr�pria classe.
 * 
 * Ou seja, s� temos acesso ao atributo ou met�do privado dentro
 *  da pr�pria classe onde ele foi declarado.
 */
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Jessica Cardoso", "pernambues, 11");
		
		Cliente cli2 = new Cliente("Joao Gabriel", "Cabula");
		
		System.out.println("Nome " + cli1.getNome());
		System.out.println("Endereco " + cli1.getEndereco());
		
		System.out.println("Nome " + cli2.getNome());
		System.out.println("Endereco " + cli2.getEndereco());

	}

}
