package javaEssencial;
//foreach // para cada
public class programa10 {
	
	public static void main(String[] args) {
		String nome = "Geek University";
		
		//Para cadad um dos caracteres da string, imprima o cacterer
		for (char letra : nome.toCharArray()) { //varre o vetor nome e imprime cada letra
			System.out.println(letra);
			
		}
	}
}
