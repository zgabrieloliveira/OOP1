public class Triangulo extends FormaBidimensional {
    
    private double base, altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void descricao() {
        System.out.println("Trata-se de um TRIÂNGULO, uma figura geométrica formada por três segmentos de reta que se encontram nas extremidades.");
    }

    public double obterArea() {
        setArea(base*altura);
        return getArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
