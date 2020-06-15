package br.com.geek.sessao21;
//Filas

/*
 * Todo elemento entra no final da fila.
 * 
 * O primeiro elemento a entrar é também o primeiro a sair.
 * 
 * 
 */
public class Programa62 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("jessica");
		fila.adiciona("joao");
		fila.adiciona("maria");
		
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		fila.remove();
		fila.remove();
		fila.remove();
		System.out.println(fila.vazia());
		System.out.println(fila);
	}

}
