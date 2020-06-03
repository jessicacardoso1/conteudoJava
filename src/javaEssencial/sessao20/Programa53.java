package br.com.geek.sessao20;
//Thread nao Sincronizada (nao é estavel)
/*
 * Por padrao as threads nao sao sncronizadas. Poe ocorrer problemas
 * de uma thread acessar o valor de um objeto que ainda nao foi atualizado
 * ou ainda as threads executarem depois do valor
 */
import br.com.geek.sessao11.Cliente;
import br.com.geek.sessao11.Conta;

public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(11, "JOAO", "RUA");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(cli1);

	}

}
