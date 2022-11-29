public class FigurinhaExtra {

    private String nome;
    private String data;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nome, String data, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        this.nome = nome;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
        this.categoria = categoria;
        this.cor = cor;
    }

    public void mostrarFigurinha() {
        System.out.println("NOME: " + getNome());
        System.out.println("DATA: " + getData());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("PESO: " + getPeso());
        System.out.println("POSICAO: " + getPosicao());
        System.out.println("PAIS: " + getPais());
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println("COR: " + getCor());
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

    public void setPais(String pais) {
        this.pais = pais;
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