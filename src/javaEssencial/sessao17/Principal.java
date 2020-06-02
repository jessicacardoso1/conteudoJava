package br.com.geek.sessao17;

import java.util.Scanner;

import br.com.geek.sessao11.Cliente;
import br.com.geek.sessao11.Conta;

/*
 * Gerando executáveis jar
 * 
 * JAR  Java Archive
 * 
 * Java Archive - Arquivo Conectado Java
 */
public class Principal {
	
	static Cliente cliente = new Cliente("jessica", "rua, 15"); //fora do main p todos os mettodos os metodos acessarem
	static Conta conta = new Conta(1, 20, 33, cliente); //ela é static para o programa main conseguir ter acesso aos atributos
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println("Informe o valor para deposito");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("deposito efetuado com sucesso");
		}else{
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	public static void sacar() {
		System.out.println("Informe o valor para deposito");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.sacar(valor);
		}else{
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	public static void consultar() {
		System.out.println("seu saldo é " + conta.getSaldo());
	}
	
	public static void main(String[] args) {
		int op = 0;
		System.out.println("Bem vindo(a)");
		
		do {
			System.out.println("digite uma opçao abaixo");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar saldo");
			System.out.println("4 - Sair");
			op = teclado.nextInt();
			
			switch (op) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				consultar();
				break;	
			default:
				System.out.println("opçao invalida");
				break;
			}
		}while(op > 0);
		teclado.close();
	}
}
