package revisaoc1;

public class Carro {
	private static int numLocados;
	private int codigo;
	private String modelo;
	private boolean locado;
	
	public Carro(int codigo, String modelo) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.locado = false;
	}
	
	public static int getNumLocados() {
		return numLocados;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isLocado() {
		return locado;
	}

	// Metodos de locação
	public boolean locar() {
		if(this.isLocado()) {
			return false;
		}
		this.locado = true;
		Carro.numLocados++;
		return true;
	}
	
	public boolean devolver() {
		if(!this.isLocado()) {
			return false;
		}
		this.locado = false;
		Carro.numLocados--;
		return true;
	}
}
