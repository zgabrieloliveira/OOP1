import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String nome[] = new String[4];
        double preco[] = new double[4];
        int qtd_estoque[] = new int[4];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto:\n");
            nome[i] = entrada.next();
            preco[i] = entrada.nextDouble();
            qtd_estoque[i] = entrada.nextInt();

        }

        entrada.close();

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");

        if(Preco.Altera_preco(preco[0], -110) == 0){
            System.out.println("\n\nErro: preco do produto " + 1 + " nao alterado. Porcentagem invalida\n");

        }else{
            System.out.println("\n\n Preco alterado com sucesso");
            preco[0] = Preco.Altera_preco(preco[0], -110);

        }

        if(Preco.Altera_preco(preco[2], 10) == 0){
            System.out.println("\n\nErro: preco do produto " + 3 + " nao alterado. Porcentagem invalida\n");

        }else{
            System.out.println("\n\n Preco alterado com sucesso");
            preco[2] = Preco.Altera_preco(preco[2], 10);

        }

        System.out.println("\nReduzindo o preco em 5% do produto 2");

        if ((Preco.Altera_preco(preco[1], -5) == 0)) {
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        } else {
            preco[1] = Preco.Altera_preco(preco[1], -5);
            System.out.println("\n\n Preco alterado com sucesso");

        }

        System.out.println("\nAlterando o preco do prod. 3");

        if (Preco.Altera_preco(preco[3], -110) == 0) {
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        } else {
            preco[3] = Preco.Altera_preco(preco[3], -110);
            System.out.println("\n\n Preco alterado com sucesso");

        }

        System.out.println("Produtos cadastrados");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d\n", nome[i], preco[i], qtd_estoque[i]);
        }
    }
}
