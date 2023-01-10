public class Cliente implements Classificavel {
    
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean MenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        
        int resultado = this.nome.compareTo(compara.nome);

        if(resultado < 0)
            return true;
        else
            return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }

}
