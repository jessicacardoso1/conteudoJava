package br.com.geek.sessao16;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n1");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe o n2");
		int n2 = teclado.nextInt();
	
		try {
			System.out.println(divisao(n1, n2));
		}catch(Exception e) {
			System.out.println("nao foi possivel executar a divisao.");
		}
		
		
		
		teclado.close();
	}
	
	//criando uma funcao, que avisa ue tem possibilidade
	//de lancar uma excecao do tipo Exception
	public static int divisao(int n1, int n2)  throws Exception{
		return n1 / n2;
	}

}
