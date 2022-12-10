import java.util.Locale;

public class Empresa {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Funcionario[] funcionarios = new Funcionario[4];
        FolhaDePagamento folhaPag = new FolhaDePagamento();

        funcionarios[0] = new Chefe("Chefe", "02/02/1968", 10000.00);
        funcionarios[1] = new Vendedor("Vendedor", "12/12/1999", 1200.00, 25.00, 80);
        funcionarios[2] = new Operario("Operario", "05/10/1994", 0.00, 25.00, 115);
        funcionarios[3] = new Horista("Horista", "06/01/2000", 0.00, 35.00, 72);

        folhaPag.relatorioPagamentos(funcionarios);

    }
}