package app;

public class Secao {
    private static double preco = 50.00;
    private String nomeFilme;
    private String horario;
    private int id;
    private Assentos assentos;

    public Secao(int id, String nome, String horario){
        this.nomeFilme = nome;
        this.horario = horario;
        this.id = id;
        this.assentos = new Assentos();
    }

    public boolean venda(int row, int col){
        return false;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Secao.preco = preco;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // Ajeitar depois
    public Assentos getAssentos() {
        return assentos;
    }

    public void setAssentos(Assentos assentos) {
        this.assentos = assentos;
    }


}
