public class VIP extends Ingresso {
    
    private double adicional;

    public VIP() {
    }

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double valorVIP(double valor, double adicional) {
        super.setValor(valor + adicional); 
        return super.getValor();
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
