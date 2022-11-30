public class Funcionario {

    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    } 
      
    public void setSalario(double salario) {
        this.salario = salario;    
    }

}
