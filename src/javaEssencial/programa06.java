package javaEssencial;
//Instru�ao switch
public class programa06 {
	
	public static void main(String[] args) {
		int numero = 5;
		
		switch (numero) {
		case 1:
			System.out.println("O numero � 1");
			break;
		case 3:
			System.out.println("O numero � 3");
			break;
		case 5:
			System.out.println("O numero � 5");
			break;
		default:
			System.out.println("O numero eh " + numero);
			break;
		}
	}
}
