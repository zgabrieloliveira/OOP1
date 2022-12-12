import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaCorrente novaConta;

        System.out.println("\n\t***ABERTURA DE CONTAS***\n");
        System.out.println("Digite o numero da conta a ser aberta:");
        int numConta = sc.nextInt();
        System.out.println("Digite o saldo a ser debitado na conta (caso nao haja deposito, digite 0):");
        float saldo = sc.nextFloat();
        System.out.println("Digite uma senha numerica para a conta:");
        int senha = sc.nextInt();
        novaConta = new ContaCorrente(saldo, numConta, senha);

        System.out.println("\n\t***SAQUES***\n");
        System.out.println("Digite a senha da conta para realizar a operacao:");
        senha = sc.nextInt();
        System.out.println("Digite o valor a ser retirado:");
        float retirada = sc.nextFloat();
        novaConta.debitaValor(retirada, senha);

        System.out.println("\n\t***DEPOSITOS***\n");
        System.out.println("Digite a senha da conta para realizar a operacao:");
        senha = sc.nextInt();
        System.out.println("Digite o valor a ser depositado:");
        float deposito = sc.nextFloat();
        novaConta.creditaValor(senha, deposito);

        sc.close();

    }
} 
