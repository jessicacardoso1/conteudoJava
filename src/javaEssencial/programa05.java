package javaEssencial;
//operador tern�rio

//digita main e d� ctrl + barra de espa�o e cria o main.
//digita sysout e d� ctrl + barra de espa�o e ele preenche o system
public class programa05 {

	public static void main(String[] args) {
		int valor = 3;
		int numero;
		/*
		if (valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}
		*/
		
		numero = (valor > 0) ? valor : 7;
		
		System.out.println(numero);
	}

}
