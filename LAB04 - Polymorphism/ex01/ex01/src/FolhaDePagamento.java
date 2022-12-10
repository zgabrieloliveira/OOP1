public class FolhaDePagamento extends Funcionario {

    double folhaFinal;

    public void relatorioPagamentos(Funcionario[] funcionarios) {
        
        for (Funcionario i : funcionarios) {
            System.out.println(i.toString());
            folhaFinal += i.getSalario();
        }
        System.out.println("TOTAL A PAGAR: R$" + folhaFinal + "\n");

    }

}
