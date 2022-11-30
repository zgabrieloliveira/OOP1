public class Horista extends Funcionario {
    
    private double valorHora;
    private int horasTrabalhadas;
    
    public Horista() {
    }

    public Horista(String nome, String dataNascimento, double salario, double valorHora, int horasTrabalhadas) {
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        salario = salarioHorista(valorHora, horasTrabalhadas);
    }

    public double salarioHorista(double valorHora, int horasTrabalhadas) {
        super.setSalario(valorHora*horasTrabalhadas);
        return super.getSalario();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return 
        "NOME: " + super.getNome() + "\n" 
        + "DATA DE NASCIMENTO: " + super.getDataNascimento() + "\n"
        + "SALARIO: R$" + super.getSalario() + "\n";
    }
}
