package br.com.geek.sessao11;

public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao da Silva", "Rua da paz, 45");
		Cliente maria = new Cliente ("Maria da Silva", "Rua da paz, 45");
		
		Conta conta_joao = new Conta(1, 100f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.f, 500.0f, maria);
		
		System.out.println("Saldo do joao (Antes do saque) " + conta_joao.getSaldo());
		System.out.println("Saldo do Maria " + conta_maria.getSaldo());
		
		
		conta_joao.sacar(150);
		System.out.println("Saldo do joao (depois do saque) " + conta_joao.getSaldo());
	}

}
