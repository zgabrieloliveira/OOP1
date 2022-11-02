public class Main {
    
    public static void main(String[] args) {

        Figurinha[] figurinhas = new Figurinha[3];

        for (int i=0; i<3; i++) {
            figurinhas[i] = new Figurinha();
        }

        figurinhas[0].setNome("Lionel Messi");
        figurinhas[0].setData("24/06/1987");
        figurinhas[0].setAltura(1.69f);
        figurinhas[0].setPeso(67.0f);
        figurinhas[0].setPosicao("PD");
        figurinhas[0].setPais("Argentina");

        figurinhas[1].setNome("Cristiano Ronaldo");
        figurinhas[1].setData("05/02/1985");
        figurinhas[1].setAltura(1.87f);
        figurinhas[1].setPeso(85.0f);
        figurinhas[1].setPosicao("ATA");
        figurinhas[1].setPais("Portugal");
        
        figurinhas[2].setNome("Karim Benzema");
        figurinhas[2].setData("19/12/1987");
        figurinhas[2].setAltura(1.85f);
        figurinhas[2].setPeso(81.0f);
        figurinhas[2].setPosicao("ATA");
        figurinhas[2].setPais("França");
        
        for(int j=0; j<3; j++) {
            System.out.println(figurinhas[j]);
        }
    }           
}