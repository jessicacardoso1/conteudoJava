package javaEssencial;

import java.util.Scanner;

public class programa09 {
	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		//Para receber dados do usuario via teclado
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("informe seu nome");
			nome = teclado.nextLine();
			
			System.out.println("informe sua idade");
			//idade = teclado.nextInt();
			idade = Integer.parseInt(teclado.nextLine()); //recebe como se fosse uma string e converte p inteiro.
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + "anos");
			}
		}
		
		
		teclado.close();
	}
}
