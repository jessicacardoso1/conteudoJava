package br.com.geek.sessao20;
//Simula�ao da gera�ao de relat�rio - Barra  tarefa
//Sem a utiliza�ao da threads




public class Programa51 {
	
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();
		
	}
}
