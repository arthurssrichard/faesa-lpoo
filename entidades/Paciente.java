package entidades;

public class Paciente {
	private String nome;
	private String CPF;
	private String dataDeNascimento;
	private String historico;
	
	
	public Paciente(String nome, String CPF, String dataDeNascimento, String historico) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dataDeNascimento = dataDeNascimento;
		this.historico = historico;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return this.CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
	
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", CPF=" + CPF + ", dataDeNascimento=" + dataDeNascimento + ", historico="
				+ historico + "]";
	}
}
