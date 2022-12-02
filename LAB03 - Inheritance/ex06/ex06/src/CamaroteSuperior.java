public class CamaroteSuperior extends VIP {

    private String localizacao;
    private double adicionalCamarote;

    public CamaroteSuperior(double valor, double adicional, String localizacao, double adicionalCamarote) {
        super.setValor(super.getValor() + super.getAdicional() + adicionalCamarote); 
        this.localizacao = localizacao;
    }

    public double valorCamarote(double valor, double adicional, double adicionalCamarote) {
        super.setValor(super.getValor() + super.getAdicional() + adicionalCamarote); 
        return super.getValor();
    }

    public void imprimeLocalizacao() {
        System.out.println(localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public double getAdicionalCamarote() {
        return adicionalCamarote;
    }

    public void setAdicionalCamarote(double adicionalCamarote) {
        this.adicionalCamarote = adicionalCamarote;
    }
    
}
