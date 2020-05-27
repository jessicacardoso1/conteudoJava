package br.com.geek.sessao13;
/*
 * Template Method
 * 
 * O padrao template method define o esqueleto de um algoritmo dentro de um metódo.
 * transferindo alguns de seus passos para as subclasses. O template method permite
 * que as subs classes redefinam certos passos de um algoritmo sem alterar a estrutura
 * proprio algoritmo
 * 
 * receber numero;
 * retornar numero * numero;
 * 
 * metodoPrincipal(){
 * passo1();
 * passo2();
 * passo3();
 * }
 */
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
	}

}
