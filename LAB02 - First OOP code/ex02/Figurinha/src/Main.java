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

        System.out.println();
        System.out.printf("NOME: %s\n", neymarJr.getNome());
        System.out.printf("DATA: %s\n", neymarJr.getData());
        System.out.printf("ALTURA: %.2f\n", neymarJr.getAltura());
        System.out.printf("PESO: %.2f\n", neymarJr.getPeso());
        System.out.printf("PAIS: %s\n", neymarJr.getPais());
        System.out.println();
        System.out.printf("NOME: %s\n", viniJr.getNome());
        System.out.printf("DATA: %s\n", viniJr.getData());
        System.out.printf("ALTURA: %.2f\n", viniJr.getAltura());
        System.out.printf("PESO: %.2f\n", viniJr.getPeso());
        System.out.printf("PAIS: %s\n", viniJr.getPais());
        System.out.println();
        System.out.printf("NOME: %s\n", thiagoSilva.getNome());
        System.out.printf("DATA: %s\n", thiagoSilva.getData());
        System.out.printf("ALTURA: %.2f\n", thiagoSilva.getAltura());
        System.out.printf("PESO: %.2f\n", thiagoSilva.getPeso());
        System.out.printf("PAIS: %s\n", thiagoSilva.getPais());
        System.out.println();
    }
}
