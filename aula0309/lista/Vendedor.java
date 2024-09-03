package lista;
public class Vendedor {
	private static double SalarioBase = 1500.00;
	private String nome;
	private int mesesDeServico;
	private char categoria;
	private double totalEmVendas;
	
	public Vendedor(String nome, int mesesDeServico, double totalEmVendas) {
		this.nome = nome;
		this.setMesesDeServico(mesesDeServico);
		this.totalEmVendas = totalEmVendas;
	}
	
	/*
	 * 20% do total de sua venda, se ela ultrapassou R$ 20.000,00, 
	 * 15% se ela esteve entre R$ 10.000,00 e R$ 20.000,00 inclusive e 
	 * 5% se suas vendas não chegaram a R$10.000,00
	 * */
	public double comissao(){
		double comissao;
		if(this.totalEmVendas > 20000) {
			comissao = this.totalEmVendas * 0.2;
		} else if(this.totalEmVendas <= 20000 && this.totalEmVendas >= 10000) {
			comissao = this.totalEmVendas * 0.15;
		} else {
			comissao = this.totalEmVendas * 0.05;
		}
		return comissao;
	}
	
	public double gratificacao(){
		
		double gratificacao = 0;
		
		switch(this.categoria) {
			case 'A':
				return this.SalarioBase*(0.15);
			case 'B':
				return this.SalarioBase*(0.075);
		}
		
		return 0;
	}
	
	/*
	 * categoria que pode ser A se o tempo de serviço for maior que 60, 
	 * B se for entre 30 e 60 inclusive e 
	 * C se for menor que 30
	 * */
	private void setarCategoria() {
		if(this.mesesDeServico > 60) {
			this.categoria = 'A';
		}else if(this.mesesDeServico < 60 && this.mesesDeServico >= 30) {
			this.categoria = 'B';
		}else {
			this.categoria = 'C';
		}
	}
	
	public double salarioFinal(){
		double salarioFinal = this.SalarioBase + this.comissao() + this.gratificacao();
		return salarioFinal;
	}
	
	
	
	
	public static double getSalarioBase() {
		return SalarioBase;
	}
	public static void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	public int getMesesDeServico() {
		return mesesDeServico;
	}
	public void setMesesDeServico(int mesesDeServico) {
		this.mesesDeServico = mesesDeServico;
		this.setarCategoria();
	}
	public double getTotalEmVendas() {
		return totalEmVendas;
	}
	public void setTotalEmVendas(double totalEmVendas) {
		this.totalEmVendas = totalEmVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [mesesDeServico=" + mesesDeServico + ", totalEmVendas=" + totalEmVendas + ", salarioFinal()="
				+ salarioFinal() + "]";
	}
	
	
	
	
}
