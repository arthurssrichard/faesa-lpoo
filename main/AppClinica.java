package main;
import entidades.*;
import lista.*;
import java.util.Scanner;

public class AppClinica {
	Scanner sc = new Scanner(System.in);

	VetPaciente vetor = new VetPaciente();
	
	public void menu(){
		System.out.println("Bem vindo à Clínica. Veja o menu:");
		boolean continuar = true;
		while(continuar){

			System.out.println("1 - Cadastrar"
			+ "\n2 - Consultar"
			+ "\n3 - Imprimir Cadastro"
			+ "\n4 - Sair");
			int option = sc.nextInt();
			
			switch(option) {
				case 1:
				this.cadastrar();
				break;
				case 2:
				this.consultar();
				break;
				case 3:
				this.imprimirCadastro();
				case 4:
				System.out.println("Encerrando sistema...");
				sc.close();
				
			}
		}
	}
	
	public void cadastrar() {
		System.out.println("Para cadastrar, insira o:");
		System.out.println("Nome: ");
		String nome = sc.next();
		
		System.out.println("CPF: ");
		String cpf = sc.next();
		
		System.out.println("Data de nascimento: ");
		String dataNascimento = sc.next();
		
		System.out.println("Histórico: ");
		String historico = sc.next();
		
		Paciente novoPaciente = new Paciente(nome, cpf, dataNascimento, historico);
		vetor.insere(novoPaciente);
		System.out.println("\nUsuário cadastrado com sucesso!\n");
	}
	
	public void consultar() {
		System.out.println("Por favor, insira o CPF do paciente que está buscando: ");
		String cpf = sc.next();
		Paciente paciente = vetor.getPaciente(vetor.pesquisa(cpf));
		this.tuplaPaciente(paciente);
	}
	
	private void tuplaPaciente(Paciente paciente) {
		System.out.println("Nome do paciente: "+ paciente.getNome() +"\nCPF: "+ paciente.getCPF() + "\nData de nascimento: "+ paciente.getDataDeNascimento()+ "\nHistórico: "+ paciente.getHistorico());
	}
	
	public void imprimirCadastro() {
		System.out.println("Imprimindo dados de todos os pacientes:");
		
	}
	
	
	
	
	
}
