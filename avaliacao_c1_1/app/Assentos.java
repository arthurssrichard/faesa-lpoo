package app;

public class Assentos {
    private boolean disponivel[][] = new boolean[5][4];
    private StringBuilder sb = new StringBuilder();

    public Assentos(){
        
    }

    public String mostraLugares(){
        String mapa;
        for(int i = 0; i < disponivel.length; i++){

            for(int j = 0; j < disponivel[i].length; j++){
                    if(disponivel[i][j]){
                        sb.append("[X]");
                    }else{
                        sb.append("[ ]");
                    }
                }
                sb.append("\n");
            }
            mapa = sb.toString();
            return mapa;
        }
    }

