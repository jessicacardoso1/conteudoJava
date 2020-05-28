package br.com.geek.sessao13;
//Template Method

/*
 * Final
 * É um modificador de acesso que faz com que
 * o elemento que esteja utilizando nao possa ser
 * extendido/reescrito.
 */
public abstract class Treinamento {
	
	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tático...");
	}
}
