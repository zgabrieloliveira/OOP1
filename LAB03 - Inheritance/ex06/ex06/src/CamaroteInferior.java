public class CamaroteInferior extends VIP {

    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super.setValor(super.getValor() + super.getAdicional()); 
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("LOCALIZACAO: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}   
