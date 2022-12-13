import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaCorrente novaConta;
        float saldo, retirada, deposito, limiteCredito;
        int numConta, senha;

        System.out.println("\n\t***ABERTURA DE CONTAS***\n");
        System.out.println("1. Conta Comum\t2. Conta Especial\n");
        System.out.println("Qual conta deseja abrir?");
        int opcao = sc.nextInt();

        switch(opcao) {

            case 1:
                System.out.println("\nDigite o numero da conta a ser aberta:");
                numConta = sc.nextInt();
                System.out.println("\nDigite o saldo a ser debitado na conta (caso nao haja deposito, digite 0):");
                saldo = sc.nextFloat();
                System.out.println("\nDigite uma senha numerica para a conta:");
                senha = sc.nextInt();
                novaConta = new ContaComum(saldo, numConta, senha, 0); // construindo objeto, limite de credito igual a 0
                System.out.println("\n------------------------------------------------");
                System.out.println("\n\t\tPARABENS!\nTudo certo e a conta foi criada com sucesso!");
                System.out.println("\n------------------------------------------------");

                System.out.println("\n\t***SAQUES***\n");
                System.out.println("\nDigite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("\nDigite o valor a ser retirado:");
                retirada = sc.nextFloat();
                novaConta.debitaValor(retirada, senha);
        
                System.out.println("\n\t***DEPOSITOS***\n");
                System.out.println("\nDigite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("\nDigite o valor a ser depositado:");
                deposito = sc.nextFloat();
                novaConta.creditaValor(senha, deposito);

                break;

            case 2: 
                System.out.println("\nDigite o numero da conta a ser aberta:");
                numConta = sc.nextInt();
                System.out.println("\nDigite o saldo a ser debitado na conta (caso nao haja deposito, digite 0):");
                saldo = sc.nextFloat();
                System.out.println("\nDigite uma senha numerica para a conta:");
                senha = sc.nextInt();
                System.out.println("\nDigite o limite de credito EXCLUSIVO da conta especial");
                limiteCredito = sc.nextFloat();

                if (limiteCredito > 0) {
                    novaConta = new ContaEspecial(saldo, numConta, senha, limiteCredito);
                    System.out.println("\n------------------------------------------------");
                    System.out.println("\n\t\tCONTA ESPECIAL APROVADA!\nParabens, a conta foi criada com sucesso!");
                    System.out.println("---------------------------------------\n");
                } 
                // se o limite nao for maior 0, a conta especial nao pode ser criada e passa a ser uma conta comum
                else {
                    novaConta = new ContaComum(saldo, numConta, senha, 0);
                    System.out.println("\n------------------------------------------------");
                    System.out.println("\n\t\tCONTA ESPECIAL NAO APROVADA...\nUma CONTA COMUM foi criada com sucesso!");
                    System.out.println("---------------------------------------\n");
                }   

                System.out.println("\n\t***SAQUES***\n");
                System.out.println("\nDigite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("\nDigite o valor a ser retirado:");
                retirada = sc.nextFloat();
                novaConta.debitaValor(retirada, senha);
                // uma conta especial continua ativa mesmo se o saldo chegar a R$0.00 
                ((ContaEspecial)novaConta).contaSempreAtiva(novaConta, senha);

                System.out.println("\n\t***DEPOSITOS***\n");
                System.out.println("\nDigite a senha da conta para realizar a operacao:");
                senha = sc.nextInt();
                System.out.println("\nDigite o valor a ser depositado:");
                deposito = sc.nextFloat();
                novaConta.creditaValor(senha, deposito);

                break;

            default:
                System.out.println("\nOpcao Invalida! Digite 1 ou 2\n");
                opcao = sc.nextInt();
                break;
        }

        sc.close();

    }
} 
