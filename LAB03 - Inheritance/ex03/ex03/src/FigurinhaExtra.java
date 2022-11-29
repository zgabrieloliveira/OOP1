public class FigurinhaExtra extends Figurinha {

    protected String categoria;
    protected String cor;

    public FigurinhaExtra(String nome, String data, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        super(nome, data, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    public void mostrarFigurinha() {
        System.out.println("\nNOME: " + getNome());
        System.out.println("DATA: " + getData());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("PESO: " + getPeso());
        System.out.println("POSICAO: " + getPosicao());
        System.out.println("PAIS: " + getPais());
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println("COR: " + getCor());
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}