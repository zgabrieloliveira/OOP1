public class Ingresso {

    private double valor;

    public void escreveValor(double valor) {
        System.out.printf("Valor: R$%.2f\n\n", valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
