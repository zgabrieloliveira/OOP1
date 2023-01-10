public class Produto implements Classificavel {
    
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public boolean MenorQue(Classificavel o) {
        Produto compara = (Produto) o;
        
        if(this.codigo < compara.codigo)
            return true;
        else
            return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Codigo: " + getCodigo();
    }

}
