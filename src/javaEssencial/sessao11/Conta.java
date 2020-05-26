package br.com.geek.sessao11;
/*
 * Getters e Setters 
 * 
 * Getter
 * 	� um met�do publico, que serve para consultar os dados;
 * 	A nomenclatura desses m�todos � get_nome_do_atributo.
 */
public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor){
		if(valor <= this.saldo){
			this.saldo = this.saldo - valor;
		}else if(valor <= (this.saldo + this.limite)){
			float val_ret = this.saldo - valor;
			if (val_ret < 0) {
				this.saldo = 0;
			}
			
			this.limite  = this.limite + val_ret;
			
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
		
	}

	public float getSaldo() {
		return this.saldo + this.limite;
	}
}
