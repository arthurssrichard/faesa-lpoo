package main;
import entidades.Aluno;
public class AppAlunos {

	public static void main(String[] args) {
		/*b.1) instancia dois objetos da classe Aluno com atributos*/
		Aluno aluno1 = new Aluno("Arthur", 23110030);
		Aluno aluno2 = new Aluno("Arthur", 23220040);
		
		/*b.2) imprime na tela os dados dos dois Alunos*/
		System.out.println(aluno1.toString());
		System.out.println(aluno2.toString());

		/*b.3) altera a nota1 do primeiro aluno, em seguida, imprime na tela os dados deste aluno*/
		aluno1.setNota1(7);
		System.out.println(aluno1.toString());
		
		
		
		/* b.4) compara o nome dos dois alunos e escreve na tela qual deles vem antes, */
		int ordem = aluno1.compareTo(aluno2);
		Aluno vet[] = new Aluno[2];
		
		
		
		if(ordem < 0) {
			System.out.println("Aluno: "+aluno1.getNome()+" vem antes.");
			vet[0] = aluno1;
			vet[1] = aluno2;
		}else if(ordem == 0) {
			System.out.println("Ambos tem o mesmo nome");
		}else {
			vet[1] = aluno1;
			vet[0] = aluno2;
			System.out.println("Aluno: "+aluno2.getNome()+" vem antes.");
		}
		
		
		/*b.5) escreve na tela os dois nomes em ordem alfabética*/
		try {
			System.out.println("Em ordem: "+vet[0].getNome() +", "+vet[1].getNome());
		}catch(NullPointerException e) {
			System.out.printf("Não tem ordem certa, aqui estão os dois: %s, %s", aluno1.getNome(), aluno2.getNome());
		}
	}

}
