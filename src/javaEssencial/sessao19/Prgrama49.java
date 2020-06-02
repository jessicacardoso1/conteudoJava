package br.com.geek.sessao19;
//HashMap

//Nao aceita chaves duplicadas, mas valores sim.

import java.util.HashMap;
import java.util.Map;

import br.com.geek.sessao11.Cliente;
import br.com.geek.sessao11.Conta;

/*
 * A classe HashMap implementa a interface Map e trabalha com chave/valor
 */
public class Prgrama49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();

		Cliente cli1 = new Cliente(11, "ana", "rua");
		Cliente cli2 = new Cliente(13, "joao", "ruaa");
	
		Conta c1 = new Conta(1, 111, 313, cli1);
		Conta c2 = new Conta(3, 333, 111, cli2);
		
		contas.put("Pessoa Física", c1); //adicionando chave e valor para o hashmap
		contas.put("pessoa juridica", c2);
		contas.put("pessoa Física", c2);
		
		System.out.println(contas.size());
		
		System.out.println(contas.get("pessoa física")); //imprime o toString da conta. 
		
	}

}
