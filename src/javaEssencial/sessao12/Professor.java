package br.com.geek.sessao12;

public class Professor extends Pessoa {
	private String matricula;
	
	public Professor(String nome, int anoNascimento, String email, String matricula){
		super(nome, anoNascimento, email);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	//Overiding ou sobrescrita de método
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula;		
	}
	//Overiding ou sobrescrita de método
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}
}
