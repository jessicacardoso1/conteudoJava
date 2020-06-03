package br.com.geek.sessao20;
/*
 Para executar m�tpdps em paralelo, nossa classe 
 deve implementar a interface Runnable, e o m�todo
 que precisar ser executado em paralelo deve
 ser executado dentro do m�tdo run
 
 * */
public class BarraDeProgresso implements Runnable{
	
	public void executa() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " Barra de progresso.... aguarde");
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + "Barra de progresso.... aguarde");
		}
	}
	
}
