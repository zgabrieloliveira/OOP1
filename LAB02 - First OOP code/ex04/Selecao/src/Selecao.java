import java.util.Arrays;

public class Selecao {

    private String selecao;
    private String jogadores[] = new String[11];
    private String tecnico;

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(String[] jogadores) {
        this.jogadores = jogadores;
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
