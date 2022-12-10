public class Cubo extends FormaTridimensional {

    private double lado;

    public Cubo() {
    }

    public Cubo(double lado) {
        this.lado = lado;
    }
    
    public void descricao() {
        System.out.println("Trata-se de um CUBO, um poliedro de 6 lados que possui todas as faces quadradas.");
    }

    public double obterArea() {
        setArea(6*lado*lado);
        return getArea();
    }

    public double obterVolume() {
        setVolume(lado*lado*lado);
        return getVolume();
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
