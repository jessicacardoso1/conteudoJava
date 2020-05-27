package br.com.geek.sessao16;

import java.util.Scanner;

//
public class Programa37 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero para divisao");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número para divisao: ");
		int num2 = teclado.nextInt();
		try{
		System.out.println("A divisao de " + num1 + "por" + num2 + "eh" + num1 / num2);
		}catch(ArithmeticException e) {
			System.out.println("Nao eh possivel dividir " + num1 + "por " + num2);
		}finally { // é sempre executado
			System.out.println("Continua o processo...");
		}
		teclado.close();
	}
