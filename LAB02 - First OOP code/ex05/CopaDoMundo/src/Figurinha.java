public class Figurinha {

    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    public Figurinha(String pais) {
        this.nome = null;
        this.data = null;
        this.altura = 0;
        this.peso = 0;
        this.posicao = null;
        this.pais = pais;
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

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}

