package javaEssencial;
//Instruçao switch
public class programa06 {
	
	public static void main(String[] args) {
		int numero = 5;
		
		switch (numero) {
		case 1:
			System.out.println("O numero é 1");
			break;
		case 3:
			System.out.println("O numero é 3");
			break;
		case 5:
			System.out.println("O numero é 5");
			break;
		default:
			System.out.println("O numero eh " + numero);
			break;
		}
	}
}
