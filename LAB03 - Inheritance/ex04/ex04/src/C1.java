public class C1 {

    public String genero;
    protected String nome;
    private long cpf;

    public C1() { 
        System.out.println("\nClasse C1: chamada do construtor padrao, sem parametros");
    }

    public C1(String genero, String nome, long cpf) {
        System.out.println("\nClasse C1: chamada do construtor padrao, com parametros");
        this.genero = genero;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarAtributos() {
        System.out.println("GENERO: " + genero);
        System.out.println("NOME: " + getNome());
        System.out.println("CPF: " + getCpf());
    }

    public void mostrarAtributosSuper() {
        this.mostrarAtributos();
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
}
