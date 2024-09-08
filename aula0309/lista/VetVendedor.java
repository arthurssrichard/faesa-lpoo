package lista;
import java.util.*;
public class VetVendedor {
	
	
	private ArrayList<Vendedor> lista = new ArrayList<Vendedor>();
	private Scanner sc = new Scanner(System.in);

	public int size(){
		return this.lista.size();
	}
	
	public VetVendedor(int tamanho){
		this.lista = new ArrayList<Vendedor>(tamanho);
	}
	public void preencher(){
		for(int i = 0; i < 3; i++){
			System.out.println("\n\nQuantos meses de servico?");
			int mesesServico = sc.nextInt();

			System.out.println("Qual o total em vendas?");
			double totalVendas = sc.nextDouble();

			System.out.println("Qual o nome do vendedor?");
			String nome = sc.next();

			Vendedor novo = new Vendedor(nome, mesesServico, totalVendas);
			this.lista.add(novo);
			System.out.println("Vendedor adicionado \n");
		}
	}
	public void listarTempoServico(){
		this.selecaoDireta();
		System.out.println("Ordenando vendedores por tempo de serviço:");
        for (int i = lista.size() - 1; i >= 0; i--) {
			Vendedor vendedor = lista.get(i);
            System.out.println("--" + vendedor.getNome()+ ": "+vendedor.getMesesDeServico() + " meses");
        }
		System.out.println("");
	}
	
    public void listar() { // Mostrar nome e categoria
		System.out.println("Listando nomes e categorias de vendedores:");
        for (Vendedor vendedor : lista) {
            System.out.println("--" + vendedor.getNome()+ ": Categoria "+vendedor.getCategoria());
        }
		System.out.println("");
    }

	public void listarVendas(){// Imprimir totais de vendas na tela
		System.out.println("Listando vendas:");
		for (Vendedor vendedor : lista) {
            System.out.println("--" + vendedor.getNome()+ ": R$ "+vendedor.getTotalEmVendas());
        }
		System.out.println("");
	}

	public void removerVendedor(){
		System.out.println("Remover vendedor: ");
		System.out.print("Digite o nome do vendedor que deseja remover ->");
		String entry = sc.next();

		System.out.println("Removendo...");
		for (Vendedor vendedor : lista) {
			if(vendedor.getNome().equals(entry)){
				lista.remove(vendedor);
				System.out.println("Removido com sucesso \n");
				return;
			}
        }

		System.out.println("Erro. Vendedor não cadastrado \n");
	}

	private void selecaoDireta(){
		int i, j, min;
		int n = this.lista.size();
		Vendedor temp = new Vendedor(" ",0, 0);
		for(i = 0; i < n-1; i++){
			min = i;
			for(j=i+1; j < n; j++){
				if(this.lista.get(j).getMesesDeServico() < this.lista.get(min).getMesesDeServico()){
					min = j;
				}
				temp = this.lista.get(min);
				this.lista.set(min, this.lista.get(i));
				this.lista.set(i, temp);
			}
		}

	}
	/* 
	 
	*/
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Vendedores:\n");
        for (Vendedor vendedor : lista) {
            sb.append("Nome: "+ vendedor.getNome() +"| Categoria: "+ vendedor.getCategoria()).append("\n");
        }
        return sb.toString();
    }
	
}
