import java.lang.Math;

public class Tetraedro extends FormaTridimensional {
    
    private double lado;
    private double altura;
    private double base;

    public Tetraedro() {
    }

    public Tetraedro(double lado, double altura, double base) {
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    public void descricao() {
        System.out.println("Trata-se de um TETRAEDRO, um poliedro composto por quatro faces triangulares, três delas encontrando-se em cada vértice.");
    }

    public double obterArea() {
        setArea(Math.pow(lado,2)*Math.sqrt(3));
        return getArea();
    }

    public double obterVolume() {
        setVolume((1/3)*((base*altura)/2)*altura);
        return getVolume();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
