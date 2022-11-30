public class Operario extends Funcionario {
    
    private double valorProducao;
    private int qntProduzida;
    
    public Operario() {
    }

    public Operario(String nome, String dataNascimento, double salario, double valorProducao, int qntProduzida) {
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.qntProduzida = qntProduzida;
        salario = salarioOperario(valorProducao, qntProduzida);
    }

    public double salarioOperario(double valorProducao, int qntProduzida) {
        super.setSalario(super.getSalario() + valorProducao*qntProduzida);
        return super.getSalario();
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQntProduzida() {
        return qntProduzida;
    }

    public void setQntProduzida(int qntProduzida) {
        this.qntProduzida = qntProduzida;
    }

    @Override
    public String toString() {
        return
        "NOME: " + super.getNome() + "\n" 
        + "DATA DE NASCIMENTO: " + super.getDataNascimento() + "\n"
        + "SALARIO: R$" + super.getSalario() + "\n";
    }

}
