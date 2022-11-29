public class C2 extends C1 {
    
    public int idade;
    protected String ocupacao;
    private double patrimonio;

    public C2() {
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String genero, String nome, long cpf, int idade, String ocupacao, double patrimonio) {
        super(genero, nome, cpf);
        this.idade = idade;
        this.ocupacao = ocupacao;
        this.patrimonio = patrimonio;
        System.out.println("Classe C2: chamada do construtor padrao, com parametros");
    }

    public void mostrarAtributos() {
        System.out.println("GENERO: " + genero);
        System.out.println("NOME: " + getNome());
        System.out.println("IDADE: " + idade);
        System.out.println("CPF: " + getCpf());
        System.out.println("OCUPACAO: " + getOcupacao());
        System.out.println("PATRIMONIO: " + getPatrimonio());
    }

    public void mostrarAtributosSuper(String genero, String nome, long cpf, int idade, String ocupacao, double patrimonio) {
        super.mostrarAtributosSuper();
        System.out.println("IDADE: " + idade);
        System.out.println("OCUPACAO: " + getOcupacao());
        System.out.println("PATRIMONIO: " + getPatrimonio());
    }

    public int getIdade() {
        return idade;
    }
    public void setNome(int idade) {
        this.idade = idade;
    }
    public String getOcupacao() {
        return ocupacao;
    }
    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
    public double getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

}
