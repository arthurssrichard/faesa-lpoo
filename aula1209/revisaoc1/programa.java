package revisaoc1;
import java.util.*;
public class programa {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tam = 3;
		ArrayList<Carro> carros = new ArrayList<>(tam);
		
		System.out.println("Insira respectivamente: ");
		for(int i = 0; i < tam; i++) {
			System.out.print("Codigo -> ");
			int codigo = sc.nextInt();
			
			System.out.print("\nModelo -> ");
			String modelo = sc.next();
			
			System.out.println("\nRegistrado.");
			
			Carro novo = new Carro(codigo, modelo);
			carros.add(novo);
		}
		
		boolean continuar = true;
		while(continuar) {
			menu(carros);
		}
		
		
		
	}
	
	public static void menu(ArrayList<Carro> carros) {
		System.out.println("\nCarros locados: "+Carro.getNumLocados()
							+ "\n1 - Locar"
							+ "\n2 - Devolver"
							+ "\n");
		
		int entry = sc.nextInt();
		switch(entry) {
			case 1:
				locar(carros);
				break;
			
			case 2:
				devolver(carros);
				break;
				
			case 3:
				sc.close();
				System.exit(0);
				break;
				
			default:
				break;
		}
	}
	
	public static void locar(ArrayList<Carro> carros) {
		System.out.println("Qual carro quer locar? (Codigo)");
		int entry = sc.nextInt();
		for(int i = 0; i < carros.size(); i++){
			if(carros.get(i).getCodigo() == entry){
				if(! carros.get(i).isLocado()) {
					carros.get(i).locar();
					System.out.println("Carro locado");
					return;
				}
				System.out.println("Carro já está locado");
			}
		}
		System.out.println("Carro não existe");
		return;
	}
	
	public static void devolver(ArrayList<Carro> carros) {
		System.out.println("Qual carro quer devolver? (Codigo)");
		int entry = sc.nextInt();
		for(int i = 0; i < carros.size(); i++){
			if(carros.get(i).getCodigo() == entry){
				if(carros.get(i).isLocado()) {
					carros.get(i).devolver();
					System.out.println("Carro devolvido");
					return;
				}
				System.out.println("Carro não está locado");
			}
		}
		System.out.println("Carro não existe");
		return;
	}
	

}
