import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        String nome, data, posicao, pais, categoria, cor;
        double altura, peso;
        Scanner sc = new Scanner(System.in);
        Figurinha normal;
        FigurinhaExtra especial;

        System.out.println("Trata-se de uma carta especial? (y/n)");
        String confirma = sc.nextLine();
        System.out.println("\nDigite o nome do jogador:");
        nome = sc.nextLine();
        System.out.println("\nDigite a data de nascimento do jogador:");
        data = sc.nextLine();
        System.out.println("\nDigite a altura do jogador:");
        altura = sc.nextDouble();
        System.out.println("\nDigite o peso do jogador:");
        peso = sc.nextDouble();
        System.out.println("\nDigite a posicao do jogador:");
        posicao = sc.nextLine();
        System.out.println("\nDigite o pais do jogador:");
        pais = sc.nextLine();

        if (confirma == "y") {
            System.out.println("\nDigite a categoria da carta (Legend ou Rookie): ");
            categoria = sc.nextLine();
            System.out.println("\nDigite a cor da figurinha (Bordo, Bronze, Prata e Ouro):");
            cor = sc.nextLine();
            especial = new FigurinhaExtra(nome, data, altura, peso, posicao, pais, categoria, cor);
            especial.mostrarFigurinha();
        }
        else {
            normal = new Figurinha(nome, data, altura, peso, posicao, pais);
            normal.mostrarFigurinha();
        }
        sc.close();
    }
}