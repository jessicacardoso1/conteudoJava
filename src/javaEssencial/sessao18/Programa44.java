package br.com.geek.sessao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			//abra o arquivo e reescreva 
		PrintStream escrever = new PrintStream( new FileOutputStream("saida.txt", true));
		
		//sempre vai sobreescrever o arquivo
		for (int i = 0; i < 5; i++) {
			System.out.println("Escreva algo:");
			String msg = teclado.nextLine();
			escrever.println(msg);
		}
		
		escrever.close();
		
		}catch (FileNotFoundException e) {
			System.out.println("Nao foi possivel criar o arquivo");
		}
		teclado.close();
		
		//apos dar run, de um refres no projeto
	}
}
