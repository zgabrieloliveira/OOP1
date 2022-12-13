import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaCorrente novaConta;
        float saldo, retirada, deposito, limiteCredito;
        int contadorCadastros=0, numConta, senha;

        System.out.println("\n\t***ABERTURA DE CONTAS***\n");
        System.out.println("1. Conta Comum\t2. Conta Especial\n");
        System.out.println("Qual conta deseja abrir?");
        int opcao = sc.nextInt();

        switch(opcao) {

            case 1:
                System.out.println("Digite o numero da conta a ser aberta:");
                numConta = sc.nextInt();
                System.out.println("Digite o saldo a ser debitado na conta (caso nao haja deposito, digite 0):");
                saldo = sc.nextFloat();
                System.out.println("Digite uma senha numerica para a conta:");
                senha = sc.nextInt();
                novaConta = new ContaComum(saldo, numConta, senha, 0); // construindo objeto, limite de credito igual a 0

                System.out.println("\n\t***SAQUES***\n");
                System.out.println("Digite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("Digite o valor a ser retirado:");
                retirada = sc.nextFloat();
                novaConta.debitaValor(retirada, senha);
        
                System.out.println("\n\t***DEPOSITOS***\n");
                System.out.println("Digite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("Digite o valor a ser depositado:");
                deposito = sc.nextFloat();
                novaConta.creditaValor(senha, deposito);

                break;

            case 2: 
                System.out.println("Digite o numero da conta a ser aberta:");
                numConta = sc.nextInt();
                System.out.println("Digite o saldo a ser debitado na conta (caso nao haja deposito, digite 0):");
                saldo = sc.nextFloat();
                System.out.println("Digite uma senha numerica para a conta:");
                senha = sc.nextInt();
                System.out.println("Digite o limite de credito EXCLUSIVO da conta especial");
                limiteCredito = sc.nextFloat();
                novaConta = new ContaEspecial(saldo, numConta, senha, limiteCredito); 
                ((ContaEspecial)novaConta).ajusteConta(novaConta, senha);

                System.out.println("\n\t***SAQUES***\n");
                System.out.println("Digite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("Digite o valor a ser retirado:");
                retirada = sc.nextFloat();
                novaConta.debitaValor(retirada, senha);
        
                System.out.println("\n\t***DEPOSITOS***\n");
                System.out.println("Digite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("Digite o valor a ser depositado:");
                deposito = sc.nextFloat();
                novaConta.creditaValor(senha, deposito);

                break;

            default:
                System.out.println("Opcao Invalida! Digite 1 ou 2\n");
                opcao = sc.nextInt();
                break;
        }

        sc.close();

    }
} 
