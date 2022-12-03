public class CopaDoMundo {
    public static void main(String[] args) {

        Figurinha neymarJr = new Figurinha();
        Figurinha viniJr = new Figurinha();
        Figurinha thiagoSilva = new Figurinha();

        neymarJr.nome = "Neymar Jr";
        neymarJr.data = "05/02/1992";
        neymarJr.altura = 1.75f;
        neymarJr.peso = 68.0f;
        neymarJr.posicao = "MEI";
        neymarJr.pais = "Brasil";

        viniJr.nome = "Vini Jr";
        viniJr.data = "12/07/2000";
        viniJr.altura = 1.76f;
        viniJr.peso = 73.0f;
        viniJr.posicao = "PE";
        viniJr.pais = "Brasil";

        thiagoSilva.nome = "Thiago Silva";
        thiagoSilva.data = "22/09/1984";
        thiagoSilva.altura = 1.81f;
        thiagoSilva.peso = 79.0f;
        thiagoSilva.posicao = "ZAG";
        thiagoSilva.pais = "Brasil";

        System.out.println();
        System.out.println("JOGADOR: " + neymarJr.nome);
        System.out.println("DATA: " + neymarJr.data);
        System.out.println("ALTURA: " + neymarJr.altura);
        System.out.println("PESO: " + neymarJr.peso);
        System.out.println("POSICAO: " + neymarJr.posicao);
        System.out.println("PAÍS: " + neymarJr.pais);
        System.out.println();
        System.out.println("JOGADOR: " + viniJr.nome);
        System.out.println("DATA: " + viniJr.data);
        System.out.println("ALTURA: " + viniJr.altura);
        System.out.println("PESO: " + viniJr.peso);
        System.out.println("POSICAO: " + viniJr.posicao);
        System.out.println("PAÍS: " + viniJr.pais);
        System.out.println();
        System.out.println("JOGADOR: " + thiagoSilva.nome);
        System.out.println("DATA: " + thiagoSilva.data);
        System.out.println("ALTURA: " + thiagoSilva.altura);
        System.out.println("PESO: " + thiagoSilva.peso);
        System.out.println("POSICAO: " + thiagoSilva.posicao);
        System.out.println("PAÍS: " + thiagoSilva.pais);
        System.out.println();

    }
}
