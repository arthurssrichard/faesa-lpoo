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
	public void debug(){
		for(int i = 0; i < nElem; i++){
			System.out.println(vet[i].toString() + "  "+ nElem);
		}
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
			if(this.vet[i].getCPF().equals(cpf)) {
				return i;
			}
		}
		return -1;
	}
	
	public int insere(Paciente paciente) {
		if(nElem == this.vet.length) {
			return -1;
		}
		for(int i = 0; i < nElem; i++){
			if(this.vet[i].getCPF() == paciente.getCPF()) {
				return -2;
			}
		}
		for(int i = nElem; i > 0; i--) {
			this.vet[i] = this.vet[i-1];
		}
		this.vet[0] = paciente;
		this.nElem++;
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
}
