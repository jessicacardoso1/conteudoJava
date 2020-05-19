//Tipos booleanos
public class programa14 {

	public static void main(String[] args) {
		// Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean ativo = true;
		
		//tipos nao primitivos
		Boolean v = true;
		Bollean f = false;

		System.out.println("verdadeiro" +verdadeiro);
		System.out.println("Falso" + falso);
		System.out.println("V" + v);
		System.out.println("F" + f);
		
		if (verdadeiro) {
			System.out.println("eh Verdadeiro");
		}else {
			System.out.println("eh falso");
		}
		
		if (ativo) {
			System.out.println("Esta ativo");
		}else {
			System.out.println("Esta desativado");
		}
	}

}
