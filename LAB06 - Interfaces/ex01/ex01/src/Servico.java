public class Servico implements Classificavel {
    
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    public boolean MenorQue(Classificavel o) {
        Servico compara = (Servico) o;
        
        if(this.valor < compara.valor)
            return true;
        else
            return false;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor: " + getValor();
    }

}
