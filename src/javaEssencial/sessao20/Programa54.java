package br.com.geek.sessao20;

import br.com.geek.sessao11.Cliente;
import br.com.geek.sessao11.Conta;
//Thread Sincronizada

/* O sincronismo ocorre pois durante a execu�ao do m�todo a thread
 * executa um 'lock' (bloqueo) da fun�ao para que outra thread
 * s� possa execut�-la p�s a finaliza�ao da thread inicial.
 * 
 */
public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(11, "JOAO", "RUA");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join(); //avisando que a thread t1 deve 'se juntar' a um suncronizador
		t2.join(); //avisando que a thread t1 deve 'se juntar' a um suncronizador
		
		System.out.println(c1);

	}

}
