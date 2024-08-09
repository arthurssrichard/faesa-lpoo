package lista;
import entidades.*;
import java.util.Scanner;
public class VetPaciente {
	Scanner sc = new Scanner(System.in);
	private Paciente[] vet;
	private int nElem;
	
	
	public VetPaciente() {
		this.vet = new Paciente[10];
		this.nElem = 0;
	}


	public int getnElem() {
		return nElem;
	}
	public void setnElem(int nElem) {
		this.nElem = nElem;
	}
	
	
	public Paciente getPaciente(int pos) {
		for(int i = 0; i < nElem; i++) {
			if(i == pos) {
				return this.vet[i];
			}
		}
		return null;
	}


	public int pesquisa(String cpf) {
		for(int i = 0; i<nElem; i++) {
			if(this.vet[i].getCPF() == cpf) {
				return i;
			}
		}
		return -1;
	}
	
	public int insere(Paciente paciente) {
		if(nElem == this.vet.length) {
			return -1;
		}
		
		for(int i = 0; i < nElem; i++) {
			if(this.vet[i].getCPF() == paciente.getCPF()) {
				return -2;
			}else if (this.vet[i] == null) {
				this.vet[i] = paciente;
				this.nElem++;
			}
		}
		return 0;	
	}
	public boolean remove(String CPF) {
		int pos = this.pesquisa(CPF);
		if(pos == -1) {
			return false;
		}
		for(int i = pos; i< nElem-1; i++) {
			this.vet[i] = this.vet[i+1];
		}
		this.vet[nElem-1] = null;
		this.nElem--;
		return true;
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
		this.insere(novoPaciente);
	}
	public void consultar() {
		System.out.println("Por favor, insira o CPF do paciente que está buscando: ");
		String cpf = sc.next();
		Paciente paciente = this.getPaciente(this.pesquisa(cpf));
		System.out.println("Nome do paciente: "+ paciente.getNome() +"\n CPF: "+ paciente.getCPF() + "\n Data de nascimento: "+ paciente.getDataDeNascimento()+ "\n Histórico: "+ paciente.getHistorico());
	}
	
	public void imprimirCadastro() {
		
	}
	
	public void AppClinica(){
		System.out.println("Bem vindo à Clínica. Veja o menu:");
		System.out.println("1 - Cadastrar"
				+ "2 - Consultar"
				+ "3 - Imprimir Cadastro"
				+ "4 - Sair");
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
