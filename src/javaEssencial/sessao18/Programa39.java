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
	
		Caixa prateleira = new Caixa();
		
		System.out.println(cli1); // Por padrao a instancia imprime com toString()
		
		if (conta1.equals(conta2)) {
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas diferentes");
		}
		
		prateleira.adicionar(conta1); // 0 - tem getSaldo
		prateleira.adicionar(conta2); //1 - n tem getSaldo
		
		//Conta conta = prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); //Cast
		
		prateleira.adicionar(cli1); // 2 = n tem getSaldo();
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome()); //Cast

		if (conta1 instanceof Conta) {
			System.out.println("O objeto é do tipo conta");	
		}else {
			System.out.println("O objwto nao é do tipo conta");
		}

	}

}
