package javaEssencial;

import java.util.Scanner;
/*
 Receba dados do usuario enquanto a idade for maior o que 0
  */

//while e do wilhe
public class programa07 {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usuario via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Sempre checa o calor antes de entrar no bloco
		while(idade < 0){
			System.out.println("informe seu nome");
			nome = teclado.nextLine();
			
			System.out.println("informe sua idade");
			//idade = teclado.nextInt();
			idade = Integer.parseInt(teclado.nextLine()); //recebe como se fosse uma string e converte p inteiro.
			
			
			System.out.println(nome + " tem " + idade + "anos");
		}
		
		teclado.close();
	}
}
