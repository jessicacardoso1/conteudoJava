package br.com.geek.sessao14;
//Interfaces

/*
 * Interfaces sao conhecidas como "contratos"
 * 
 * Uma empresa criou um contrato 'com regras' para definir
 * a cria�ao de um produto/servi�o.
 *  
 *  Quem implementar este contrato � obrigado a seguir as regras.
 *  
 * O joao decidiu implementar um produto/servico baseado neste contrato
 * A Maria tamb�m decidiu implementar um produto/servico baseado no mesmo contrato.
 * 
 * Contrato para a confec�ao de um bolo.
 * 		O bolo precisa ser de chocolate;
 * 		O bolo dve ter cobertura;
 * 		O bolo deve ser recheado.
 * 
 */
public class Programa33 {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador �" + vent.MARCA);
		
		vent.desligar(); //nao deve imprimir a msg
		
		vent.ligar(); //deve imprimir a msg
		
		vent.desligar(); //deve imprimir a msg

	}

}
