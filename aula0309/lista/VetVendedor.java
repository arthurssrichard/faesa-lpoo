package lista;
import java.util.*;
public class VetVendedor {
	
	
	private ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
	private Scanner sc = new Scanner(System.in);
	
	public VetVendedor(int tamanho){
		this.lista = new ArrayList<Vendedor>(tamanho);
	}
	public void preencher(){
		for(int i = 0; i < 3; i++){
			System.out.println("\n\nQuantos meses de servico?");
			int mesesServico = sc.nextInt();

			System.out.println("Qual o total em vendas?");
			double totalVendas = sc.nextDouble();

			Vendedor novo = new Vendedor("Fulano", mesesServico, totalVendas);
			this.lista.add(novo);
			System.out.println("Vendedor adicionado");
		}
	}

	
    public void listar() {
        for (Vendedor vendedor : lista) {
            System.out.println(vendedor);
        }
    }

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Vendedores:\n");
        for (Vendedor vendedor : lista) {
            sb.append("Nome: "+vendedor.getNome() +"| Categoria: "+ vendedor.getCategoria()).append("\n");
        }
        return sb.toString();
    }
	
}
