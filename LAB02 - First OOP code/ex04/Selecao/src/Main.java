public class Main {
    
    public static void main(String[] args) {

        Selecao[] selecao = new Selecao[2];
        String jogadores1[] = new String[11];
        String jogadores2[] = new String[11];

        jogadores1[0] = "Alisson";
        jogadores1[1] = "Marquinhos";
        jogadores1[2] = "Thiago Silva";
        jogadores1[3] = "Alex Sandro";
        jogadores1[4] = "Danilo";
        jogadores1[5] = "Casemiro";
        jogadores1[6] = "Bruno Guimaraes";
        jogadores1[7] = "Paqueta";
        jogadores1[8] = "Neymar Jr";
        jogadores1[9] = "Vini Jr";
        jogadores1[10] = "Gabriel Jesus";

        jogadores2[0] = "Lloris";
        jogadores2[1] = "Lucas Hernandez";
        jogadores2[2] = "Varane";
        jogadores2[3] = "Pavard";
        jogadores2[4] = "Theo Hernandez";
        jogadores2[5] = "Kante";
        jogadores2[6] = "Tchouameni";
        jogadores2[7] = "Griezmann";
        jogadores2[8] = "Dembele";
        jogadores2[9] = "Mbappe";
        jogadores2[10] = "Benzema";
        
        for (int i=0; i<2; i++) {
            selecao[i] = new Selecao();
        }

        selecao[0].setSelecao("Brasil");
        selecao[0].setJogadores(jogadores1);
        selecao[0].setTecnico("Tite");

        selecao[1].setSelecao("Franca");
        selecao[1].setJogadores(jogadores2);
        selecao[1].setTecnico("Didier Deschamps");
        
        for(int j=0; j<2; j++) {
            System.out.println(selecao[j]);
        }
    }           
}