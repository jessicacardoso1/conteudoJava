//contrutores
/*
 *  Sempre um construtor vazio tem a seguinte forma:
 *  
 * public NomeDaClasse()
 */
package teste;

public class Pessoa {
	String nome, email;
	int anonascimento;
	
	//construtor vazio
	public Pessoa() {
		
	}
	//contrutor com parametros
	public Pessoa(String nome, String email, int anonascimento) {
		//this siginifica esse objeto
		this.nome = nome;
		this.email = email;
		this.anonascimento = anonascimento;
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano nascimento: " + this.anonascimento);

	}
	
}
