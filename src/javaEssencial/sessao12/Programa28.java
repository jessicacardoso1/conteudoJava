package br.com.geek.sessao12;
//Herança 
public class Programa28 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("joao", 1111, "jejegmail.com"); 
		System.out.println(p1);
		System.out.println(p1.getNome());
		System.out.println("\n");
		
		Aluno a1 = new Aluno("joao", 1111, "joaogmail.com", "1111111"); //objeto do tipo aluno
		System.out.println(a1);
		System.out.println(a1.getNome());
		System.out.println("\n");
		
		Professor prof1 = new Professor("jessica", 1333, "jessicagmail.com", "333333");
		System.out.println(prof1);
		System.out.println(prof1.getNome());
	}

}
