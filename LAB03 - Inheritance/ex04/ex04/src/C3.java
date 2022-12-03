public class C3 extends C2 {
    
    public String usuario;
    protected String email;
    private String endereco;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(String genero, String nome, long cpf, int idade, String ocupacao, double patrimonio, String usuario, String email, String endereco) {
        super(genero, nome, cpf, idade, ocupacao, patrimonio);
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");
        this.usuario = usuario;
        this.email = email;
        this.endereco = endereco;
    }

    public void mostrarAtributos() {
        System.out.println("GENERO: " + genero);
        System.out.println("NOME: " + getNome());
        System.out.println("IDADE: " + idade);
        System.out.println("CPF: " + getCpf());
        System.out.println("OCUPACAO: " + getOcupacao());
        System.out.println("PATRIMONIO: R$" + getPatrimonio());
        System.out.println("USUARIO: " + usuario);
        System.out.println("EMAIL: " + getEmail());
        System.out.println("ENDERECO: " + getEndereco());
    }

    public void mostrarAtributosSuper(String genero, String nome, long cpf, int idade, String ocupacao, double patrimonio, String usuario, String email, String endereco) {
        super.mostrarAtributosSuper();
        System.out.println("USUARIO: " + usuario);
        System.out.println("EMAIL: " + getEmail());
        System.out.println("ENDERECO: " + getEndereco());
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
