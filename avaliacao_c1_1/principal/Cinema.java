package principal;
import app.*;
import java.util.*;
public class Cinema {

    public static Scanner sc = new Scanner(System.in);
    public ArrayList<Secao> secoes = new ArrayList<>(5); 
    public int increment;
    public static void main(String[] args) {
        Assentos assentos = new Assentos();
        System.out.println(assentos.mostraLugares());


        System.out.println("Bem vindo ao cinema!");
    }


    public void menu(){
        boolean continuar = true;
        while(continuar){
            System.out.println("1 - Cadastrar"
            +"2 - Vender"
            +"3 - Sair"
            );
            int entry = sc.nextInt();

            switch (entry) {
                case 1:
                cadastrar();
                    break;


                case 2:
                vender();
                    break;


                case 3:
                sc.close();
                System.exit(0);
                    break;

            
                default:
                System.out.println("Insira um código válido");
                    break;
            }
        }
    }


    public void cadastrar(){
        System.out.println("Quantas seções quer cadastrar?");
        int entry = sc.nextInt();

        for(int i = 0; i < entry; i++){
            System.out.println("Insira respectivamente: ");
            System.out.println("Nome do filme ->");
            String nome = sc.next();
            System.out.println("Horário (ex: 19:30) ->");
            String horario = sc.next();

            Secao nova = new Secao(increment, nome, horario);
            secoes.add(nova);
            System.out.println("Seção registrada \n");
        }
    }

    public void vender(){
        System.out.println("Seções disponíveis");
        // Mostra as seções

        for(int i = 0; i < secoes.size() ; i++){
            System.out.printf("ID: %s | Título: %s - %s", secoes.get(i).getId(), secoes.get(i).getNomeFilme(), secoes.get(i).getHorario());
        }
        System.out.println("Qual seção deseja assistir?");
        int entry = sc.nextInt();
        // continuar pra fazer a procura
    }
}
