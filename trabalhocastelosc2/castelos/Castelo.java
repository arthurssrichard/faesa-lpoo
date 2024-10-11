package castelos;

public abstract class Castelo {
    protected int defesa;
    protected int pontosVida;
    protected String nome;

    public abstract String situacao();
    public abstract boolean ataque(int p);
}


