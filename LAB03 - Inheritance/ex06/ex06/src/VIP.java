public class VIP extends Ingresso {
    
    private double adicional;

    public double valorVIP(double valor, double adicional) {
        super.setValor(super.getValor() + adicional); 
        return super.getValor();
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
