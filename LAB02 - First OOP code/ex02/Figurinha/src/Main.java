public class Main {
    public static void main(String [] args) {

        Figurinha neymarJr = new Figurinha();
        Figurinha viniJr = new Figurinha();
        Figurinha thiagoSilva = new Figurinha();

        neymarJr.setNome("Neymar Jr");
        neymarJr.setData("05/02/1992");
        neymarJr.setAltura(1.75);
        neymarJr.setPeso(68.00);
        neymarJr.setPosicao("MEI");
        neymarJr.setPais("Brasil");
    
        viniJr.setNome("Vini Jr");
        viniJr.setData("12/07/2000");
        viniJr.setAltura(1.76);
        viniJr.setPeso(73.00);
        viniJr.setPosicao("PE");
        viniJr.setPais("Brasil");
    
        thiagoSilva.setNome("Thiago Silva");
        thiagoSilva.setData("22/09/1984");
        thiagoSilva.setAltura(1.81);
        thiagoSilva.setPeso(79.00);
        thiagoSilva.setPosicao("ZAG");
        thiagoSilva.setPais("Brasil");

        neymarJr.printFigurinha();
        viniJr.printFigurinha();
        thiagoSilva.printFigurinha();
        
    }
}
