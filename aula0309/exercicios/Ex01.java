package exercicios;
import lista.*;
public class Ex01 {

	public static void main(String[] args) {
		VetVendedor lista = new VetVendedor(3);

		lista.preencher();
		
		// 1 - Mostre na tela os vendedores com maior tempo de serviço
		lista.listarTempoServico();

		// 2 - Moste na tela o nome e a categoria de todos os vendedores
        lista.listar();

		// 3 - Imprimir o total de todas as vendas na tela
		lista.listarVendas();

		// 4 - Pedir o nome de um vendedor e removê-lo da lista. 
		lista.removerVendedor();

		lista.listar();
	}

}
