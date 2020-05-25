
public class programa21 {

	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;
		
		//res = soma(valor1, valor2);
		
		//System.out.println("O resultado é " + res);
		
		//imprimindo a funçao.
		System.out.println("O resultado é " + soma(valor1, valor2));
		System.out.println(mensagem());
	}
	
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
	static String mensagem() {
		return "Ola usuario";
	}
}
