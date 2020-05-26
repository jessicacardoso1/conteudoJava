package br.com.geek.sessao12;
/*
 * Beneficios da heran�a
 * Evita a repeti�ao de codigo
 * Facilita a manuten�ao do programa
 * 
 * 
 *///sub classe ou classe filha

public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int anoNascimento, String email, String ra) {
		super(nome, anoNascimento, email);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	//Overriding ou sobrescrita de m�todo
	public String toString() {
		return super.toString() + "\n R.A" + this.ra;
	}
	//Overriding ou sobrescrita de m�todo
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}
}
	
	
	
	
