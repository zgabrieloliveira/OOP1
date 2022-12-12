public class Amigos extends Contato {
    
    private int grauAmizade;

    public Amigos() {
    }

    public Amigos(int grauAmizade) {
        this.grauAmizade = grauAmizade;
    }

    public Amigos(String apelido, String nome, String email, String aniversario, int grauAmizade) {
        super(apelido, nome, email, aniversario);
        this.grauAmizade = grauAmizade;
    }

    public int getGrauAmizade() {
        return grauAmizade;
    }

    public void setGrauAmizade(int grauAmizade) {
        this.grauAmizade = grauAmizade;
    }

    public void imprimirContato() {
        imprimirBasico();
        System.out.println("PROXIMIDADE: " + getGrauAmizade());
    }
}
