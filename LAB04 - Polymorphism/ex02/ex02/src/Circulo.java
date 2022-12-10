import java.lang.Math;

public class Circulo extends FormaBidimensional {
    
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void descricao() {
        System.out.println("Trata-se de um CÍRCULO, conjunto de pontos resultantes da união entre uma circunferência e seus pontos internos.");
    }

    public double obterArea() {
        setArea(Math.PI*Math.pow(raio, 2));
        return getArea();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
