package br.com.geek.sessao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.geek.sessao11.Cliente;

public class Programa47 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//melhor forma de usar o Arralylist é dizendo que ele é uma list, pois o arraylist herda de list.
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		
		Cliente cli1 = new Cliente(1117, "Erica", "rua1");
		Cliente cli2 = new Cliente(1711, "joao", "rua");
		Cliente cli3 = new Cliente(88, "jessica", "rua3");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente); //aqui ele usa o metodo toString
		}
		
	
		
	}

}
