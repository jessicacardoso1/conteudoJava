package br.com.geek.sessao21;

public class Programa59 {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("jessica");
		System.out.println(lista);
		lista.adiciona("Maria");
		lista.adiciona("felicity");
		System.out.println(lista);;
		
		lista.remove(1);
		System.out.println(lista);
		
		System.out.println(lista.contem("Angelina"));;
	}

}
