//contrutor
/*
 *  JVM java virtual machine cria em tempo de execuçao um
 * construtor vazio 
 */
package teste;

public class programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); //construtor
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.anonascimento = 1986;
		pessoa1.imprime_informacoes();
		
		//utiliza o construtor com parametros. 
		Pessoa pessoa2 = new Pessoa("Angelina", "Angelina@gmail.com", 1976);
		pessoa2.imprime_informacoes();
		

	}

}
