public class Main {
    public static void main(String[] args) throws Exception {
        
        Forma[] formasGeometricas = new Forma[6];
        formasGeometricas [0] = new Circulo(5.00);
        formasGeometricas [1] = new Cubo(3.00);
        formasGeometricas [2] = new Esfera(4.00);
        formasGeometricas [3] = new Quadrado(6.00);
        formasGeometricas [4] = new Tetraedro(5.00, 5.00, 10.00);
        formasGeometricas [5] = new Triangulo(15.00, 10.00);
       
        for (int i=0; i<6; i++) {
            System.out.printf("ELEMENTO %d: ", i+1); 
            formasGeometricas[i].descricao();

            if (formasGeometricas[i] instanceof FormaBidimensional) {
                formasGeometricas[i].obterArea();
                System.out.println(formasGeometricas[i]);
            }
            if (formasGeometricas[i] instanceof FormaTridimensional) {
                formasGeometricas[i].obterVolume();
                System.out.println(formasGeometricas[i]);
            }
        }
    }
}
