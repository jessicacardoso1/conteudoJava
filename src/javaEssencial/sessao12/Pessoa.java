package br.com.geek.sessao12;

//classe mae, classe base, super classe

public class Pessoa {
	private String nome;
	private int anoNascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int anoNascimento, String email) {	
		this.nome = nome;
		this.anoNascimento = anoNascimento; 
		this.email  = email;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
	
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	//Overriding ou sobrescrita de método
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " +this.anoNascimento;
	}
	
	//Overloading / Sobrecarga de método
	public void mensagem() {
		System.out.println("Esta é minha mensagem");
	}
	
	//Overloading / Sobrescrita de método
	public int mensagem(String msg) {
		System.out.println(msg);
		return 0;
	}
}
