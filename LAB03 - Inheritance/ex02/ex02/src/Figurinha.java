public class Figurinha {

    protected String nome;
    protected String data;
    protected double altura;
    protected double peso;
    protected String posicao;
    protected String pais;

    public Figurinha(String nome, String data, double altura, double peso, String posicao, String pais) {
        this.nome = nome;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void mostrarFigurinha() {
        System.out.println("\nNOME: " + getNome());
        System.out.println("DATA: " + getData());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("PESO: " + getPeso());
        System.out.println("POSICAO: " + getPosicao());
        System.out.println("PAIS: " + getPais());
    }

    public String getPais() {
        return pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}