import java.lang.Math;

public class Esfera extends FormaTridimensional {
    
    private double raio;

    public Esfera() {
    }

    public Esfera(double raio) {
        this.raio = raio;
    }
    
    public void descricao() {
        System.out.println("Trata-se de uma ESFERA, um sólido geométrico classificado como um corpo redondo");
    }

    public double obterArea() {
        setArea(4*Math.PI*Math.pow(raio, 2));
        return getArea();
    }

    public double obterVolume() {
        setVolume((4*Math.PI*Math.pow(raio, 3)/3));
        return getVolume();
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
