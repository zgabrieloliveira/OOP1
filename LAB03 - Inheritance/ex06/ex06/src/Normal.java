public class Normal extends Ingresso {
    
    public Normal() {
    }

    public Normal(double valor) {
        valor = super.getValor();
    }

    public void imprimeIngresso() {
        System.out.println("***INGRESSO NORMAL***");
    }
}
