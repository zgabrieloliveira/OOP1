import java.util.Arrays;

public class Selecao {

    private String selecao, tecnico;
    private Figurinha jogadores[];

    public Selecao(String selecao, String tecnico) {

        Figurinha jogadores[] = new Figurinha[11];
        String pais=null;

        for (int i=0; i<11; i++) {
            jogadores[i] = new Figurinha(pais);
        }

    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "\nSELECAO: " + selecao + "\nJOGADORES: " + Arrays.toString(jogadores) + "\nTECNICO: " + tecnico + "\n";
    }
    
}