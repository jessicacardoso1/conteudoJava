package br.com.geek.sessao20;
//Simula�ao da gera�ao de relat�rio - Barra  tarefa
//Sem a utiliza�ao da threads


public class Programa52 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();
	}

}
