
//vetores parte 2
//ctrl e barra comenta todo o texto selecionado
public class programa17 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		for(int i; i < numeros.length; i++) {
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		
		for(int i; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10); //gera um numero aleatorio, multiplica por dez e depois arredonda.			
		}
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
