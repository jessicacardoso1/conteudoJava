//operaçoes matematicas
public class programa15 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 9;
		int res;
		float res2;
		
		//soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é " + res );
		
		//subtraçao
		res = num1 - num2;
		System.out.println("A subtracao de " + num1 + " - " + num2 + " é " + res );
		
		//multiplicacao
		res = num1 * num2;
		System.out.println("A multiplicacao de " + num1 + " * " + num2 + " é " + res );
		
		//divisao inteira
		res = num2/num1;
		System.out.println("A divisao de " + num1 + " / " + num2 + " é " + res );
		
		//divisao real
		res2 = (float)num2/(float)num1;
		System.out.println("A divisao de " + num1 + " / " + num2 + " é " + res );
		
		//modulo
		res = num1 % num2;
		System.out.println("o modulod de " + num1 + " % " + num2 + " é " + res );s


	}

}
