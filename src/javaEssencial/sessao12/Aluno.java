package br.com.geek.sessao12;
/*
 * Beneficios da herança
 * Evita a repetiçao de codigo
 * Facilita a manutençao do programa
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
	//Overriding ou sobrescrita de método
	public String toString() {
		return super.toString() + "\n R.A" + this.ra;
	}
	//Overriding ou sobrescrita de método
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}
}
	
	
	
	
