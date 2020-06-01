package br.com.geek.sessao18;

import br.com.geek.sessao11.Cliente;
import br.com.geek.sessao11.Conta;

/*Object: A mae de todas as classes */

/*
 * A classe object faz parte do pacote java.lang
 * */

public class Programa39 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Angelina", "rua x");
		Cliente cli2 = new Cliente("Joao", "rua" );
		Conta conta1 = new Conta(1, 111, 1111, cli1);
		Conta conta2 = new Conta(1, 111, 1111, cli2);
	
		System.out.println(cli1); // Por padrao a instancia imprime com toString()
		
		if (conta1.equals(conta2)) {
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas diferentes");
		}
	}

}
