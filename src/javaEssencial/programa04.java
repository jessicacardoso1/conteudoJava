//if, else, if else
package javaEssencial;

public class programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 9;
		
		if (numero > 5) {
			System.out.println("Sim, o numero " + numero + " � maior que 5"); 
		}else if(numero == 5){
			System.out.println("O numero " + numero + " � igual a 5");
		}else {
			System.out.println("Nao, o numero " + numero + " nao � maior que 5");
		}
	}

}
