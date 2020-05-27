package br.com.geek.sessao14;
/*
 * Uma interface pode conter:
 * 		Constantes
 * 		metodos abstratos
 * 
 * Interface para servir de contrato para produtos eletronicos.
 * Todo produto eletronico que implementar esta interface OBRIGATORIAMENTE
 * deverao implementar os métodos abstratos;
 * 
 * todas as classes que implementarem essa interface é obrigatorio que elas
 * tenham os mesmos metodos astratdos e a marca.
 * 
 * Diferença de class e interface
 * So pode ter constantes e n pode ter metodos implementados, só abstratos.
 *
 *Todo mundo que implementar a interface vai ter os metodos.
 */

public interface IEletronico {
	//Uma constante
	public String MARCA = "Geek"; 
	
	public void ligar();
	
	public void desligar();
}
