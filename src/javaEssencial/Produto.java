//Classes
/*
 * Nome de classes se inicia com letras maiuculas.
 * public class NomedaClasse
 * */

/*Atributos
 * 
 * Sao as caracteristicas da classe/molde/modelo de dados
 * Podemos entender atributos como variaveis da classe
 * Uma outra forma de nomenclatura para os atributos sao estados;
 * */

/*Metodos
 * 
 * Podemos entender os métodos como a açao que é realizada por um objeto da classe 
 * Metodos sao comportamentos dos objetoa da classe;
 * Como se fosse uma funçao.
 */


package teste;

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
}
