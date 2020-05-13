package javaEssencial;

import java.util.Scanner;
/*
 Receba os dados do usuario enquato a idade for maior que 0
 */

// do while
public class programa08 {

	public static void main(String[] args) {
			
			int idade = 1;
			String nome;
			
			//Para receber dados do usuario via teclado
			Scanner teclado = new Scanner(System.in);
			
			//primeiro executa o bloco, e depois faz a checagem
			do{
				System.out.println("informe seu nome");
				nome = teclado.nextLine();
				
				System.out.println("informe sua idade");
				//idade = teclado.nextInt();
				idade = Integer.parseInt(teclado.nextLine()); //recebe como se fosse uma string e converte p inteiro.
				
				if (idade > 0) {
					System.out.println(nome + " tem " + idade + "anos");
				}
				
			}while(idade > 0);
			
			teclado.close();
		}

}
