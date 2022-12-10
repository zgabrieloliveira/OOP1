public class Chefe extends Funcionario {

    public Chefe() {
    }

    public Chefe(String nome, String dataNascimento, double salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public String toString() {
        return 
        "NOME: " + super.getNome() + "\n" 
        + "DATA DE NASCIMENTO: " + super.getDataNascimento() + "\n"
        + "SALARIO: R$" + super.getSalario() + "\n";
    }
    
}