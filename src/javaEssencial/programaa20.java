package javaEssencial;
import java.util.Scanner;

//criando funçoes

/*faça um programa que receba diversos nomes de frutas do usuario e no final imprima essas frutas em ordem contrari
o programa deve solicitar ao usuario quantas frutas ele quer informar. */
public class programa20 {
	static String frutas[]; //se a funcao é static, as variaveis tem que ser static tb
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd;
		System.out.println("Informe a quantidade de frutas para cadastrar");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
		
		teclado.close();
	}
	
	static void cadastrar_dados(int quantidade) {
		//definindo o tamanho do vetor
		frutas = new String[quantidade];
				
		for(int i = 0; i<quantidade; i++) {
			System.out.println("Informe a "+ (i +1) +" fruta");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) {
		for(int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
}

