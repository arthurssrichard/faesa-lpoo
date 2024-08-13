package entidades;
/*
 * 
 * a) Faça uma classe que define um objeto Aluno com os seguintes atributos: 
nome, 
matricula (int), 
duas
notas e 
média.
Faça o 
construtor, os métodos gets e sets, toString ecompareTo 
(que compara o nome de dois alunos e
devolve o resultado da comparação deste atributo
nome).

 * */
public class Aluno {
	private String nome;
	private int matricula;
	private double nota1;
	private double nota2;
	private double media;
	
	public Aluno(String nome, int matricula){
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = 0;
		this.nota2 = 0;
		this.media = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
		this.atualizarMedia();
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
		this.atualizarMedia();
	}
	
	public int compareTo(Aluno aluno){
		int resultado = this.nome.compareTo(aluno.getNome());
		return resultado;
	}

	
	private void atualizarMedia() {
		this.media = (this.nota1 + this.nota2) / 2;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media="
				+ media + "]";
	}
	
	
}
