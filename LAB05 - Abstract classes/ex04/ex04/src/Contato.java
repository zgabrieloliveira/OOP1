public abstract class Contato {
    
    private String apelido, nome, email, aniversario;

    public Contato() {
    }

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public void imprimirBasico() {
        System.out.println("\nNOME: " + getNome());
        System.out.println("APELIDO: " + getApelido());
        System.out.println("EMAIL: " + getEmail());
        System.out.println("ANIVERSARIO: " + getAniversario());
    }

    public abstract void imprimirContato();

}
