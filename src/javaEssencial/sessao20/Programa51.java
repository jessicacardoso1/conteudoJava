package br.com.geek.sessao20;
//Simulaçao da geraçao de relatório - Barra  tarefa
//Sem a utilizaçao da threads




public class Programa51 {
	
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();
		
	}
}
