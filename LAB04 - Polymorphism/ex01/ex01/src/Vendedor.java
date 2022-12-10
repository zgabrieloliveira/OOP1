public class Vendedor extends Funcionario {
    
    private double comissao;
    private int vendas;
    
    public Vendedor() {
    }

    public Vendedor(String nome, String dataNascimento, double salario, double comissao, int vendas) {
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
        this.vendas = vendas;
        salario = salarioVendedor(comissao, vendas);
    }
    
    public double salarioVendedor(double comissao, int vendas) {
        super.setSalario(super.getSalario() + comissao*vendas);
        return super.getSalario();
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return 
        "NOME: " + super.getNome() + "\n" 
        + "DATA DE NASCIMENTO: " + super.getDataNascimento() + "\n"
        + "SALARIO: R$" + super.getSalario() + "\n";
    }
}