package br.com.geek.sessao22;

public class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAlunos() {
		return this.alunos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
