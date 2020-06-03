package br.com.geek.sessao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	public void adiciona(Aluno aluno) {
		this.garantirEspaco();
		this.alunos[total] = aluno;
		total++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i = total -1; i>= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.alunos[posicao];	
	}
	
	public void remove(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		total--;
	}
	
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (aluno.equals(aluno)) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.total;
	}
	@Override
	public String toString() {
		return Arrays.toString(this.alunos); //Facilita na vizualizaçao do array
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	public void garantirEspaco() {
		//Verifica se o array alunos está cheio
		if (total == alunos.length) {
			//Caso esteja cheio, ele cria um novo array com o dobro do tamanho do array anterior
			Aluno novoArray[] = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			//Por ultimo, atribuímos o novo array ao array original
			this.alunos = novoArray;
		}

	}
}
