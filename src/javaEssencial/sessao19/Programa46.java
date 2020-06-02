package br.com.geek.sessao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas
public class Programa46 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(11);
		numeros.add(13);
		numeros.add(133);
		numeros.add(111);
		
		Collections.sort(numeros);
		
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

	}

}
