import java.util.Scanner;
import java.util.Locale;

public class UsaBanco {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaCorrente[] contasCadastradas = new ContaCorrente[2];

        contasCadastradas[0] = new ContaEspecial(570, 384920, 203249, 1000);
        contasCadastradas[1] = new ContaEspecial(280, 293201, 54930, 500);

        // testando debitos com saldo chegando a R$0.00
        System.out.println("--------------------------------------------");
        System.out.println("\n\t*EXTRATO CONTA 1:\n\n");
        System.out.println("- SAQUE REALIZADO:\n\nSALDO ANTES DO SAQUE: " + contasCadastradas[0].getSaldo(203249));
        contasCadastradas[0].debitaValor(100, 203249); // senha correta, saque aprovado
        System.out.println("SALDO APOS O SAQUE: " + contasCadastradas[0].getSaldo(203249));
        System.out.println("\n\n- SAQUE REALIZADO:\n\nSALDO ANTES DO SAQUE: " + contasCadastradas[0].getSaldo(203249));
        ((ContaEspecial)contasCadastradas[0]).contaSempreAtiva(contasCadastradas[0], 203249); // verificando se saldo igual a 0
        contasCadastradas[0].debitaValor(470, 203249); // senha correta, saque aprovado
        System.out.println("SALDO APOS O SAQUE: " + contasCadastradas[0].getSaldo(203249));
        ((ContaEspecial)contasCadastradas[0]).contaSempreAtiva(contasCadastradas[0], 203249); // saldo igual a 0, porem conta permanece ativa
        System.out.println("ESTADO DA CONTA (1 = ativa, 2 = inativa): " + contasCadastradas[0].getEstado(203249));
        System.out.println("\n- DEPOSITO REALIZADO:\n\nSALDO ANTES DO DEPOSITO: " + contasCadastradas[0].getSaldo(203249));
        contasCadastradas[0].creditaValor(203249, 1000); // senha correta, deposito aprovado
        System.out.println("SALDO APOS O DEPOSITO: " + contasCadastradas[0].getSaldo(203249));
        System.out.println("--------------------------------------------\n\n");

        // testando debitos com saldo nao chegando a R$0.00
        System.out.println("--------------------------------------------");
        System.out.println("\n\t*EXTRATO CONTA 2:\n\n");
        System.out.println("- SAQUE REALIZADO:\n\nSALDO ANTES DO SAQUE: " + contasCadastradas[1].getSaldo(54930));
        contasCadastradas[1].debitaValor(240, 54930); // senha correta, saque aprovado
        System.out.println("SALDO APOS O SAQUE: " + contasCadastradas[1].getSaldo(54930));
        ((ContaEspecial)contasCadastradas[1]).contaSempreAtiva(contasCadastradas[1], 54930); // verificando se saldo igual a 0
        System.out.println("ESTADO DA CONTA (1 = ativa, 2 = inativa): " + contasCadastradas[1].getEstado(54930));
        System.out.println("\n- DEPOSITO REALIZADO:\n\nSALDO ANTES DO DEPOSITO: " + contasCadastradas[1].getSaldo(54930));
        contasCadastradas[1].creditaValor(54930, 1300); // senha correta, deposito aprovado
        System.out.println("SALDO APOS O DEPOSITO: " + contasCadastradas[1].getSaldo(54930));
        System.out.println("--------------------------------------------");

        sc.close();

    }
} 
