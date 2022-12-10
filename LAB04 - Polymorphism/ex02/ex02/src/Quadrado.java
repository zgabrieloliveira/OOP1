import java.lang.Math;

public class Quadrado extends FormaBidimensional {
    
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void descricao() {
        System.out.println("Trata-se de um QUADRADO, um polígono convexo que possui quatro lados.");
    }

    public double obterArea() {
        setArea(Math.pow(lado, 2));
        return getArea();
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
