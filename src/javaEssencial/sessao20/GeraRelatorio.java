package br.com.geek.sessao20;
/*
Para executar métpdps em paralelo, nossa classe 
deve implementar a interface Runnable, e o método
que precisar ser executado em paralelo deve
ser executado dentro do método run.

* */
public class GeraRelatorio implements Runnable {
	
	public void executa() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " Gerando relatório....aguade ");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " Gerando relatório....aguade ");
		}
	}
}
