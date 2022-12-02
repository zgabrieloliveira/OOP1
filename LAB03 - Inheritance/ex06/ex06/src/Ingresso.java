public class Ingresso {

    private double valor;

    public void escreveValor() {
        System.out.printf("Valor: %.2f\n\n", valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
