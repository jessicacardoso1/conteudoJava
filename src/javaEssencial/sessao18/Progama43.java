package br.com.geek.sessao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Progama43 {

	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(new FileInputStream("entrada.txt"));
			
			while (ler.hasNextLine()) { //enquanto tiver proxima linha, ele vai ler a linha e printar a a linha
				String linha = ler.nextLine();
				System.out.println(linha);
				
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
		

	}

}
