import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        String genero, nome, ocupacao, usuario, email, endereco;
        int idade, cpf;
        double patrimonio;
        Scanner sc = new Scanner(System.in);

        C1 classe1 = new C1();
        System.out.println("\nDigite qual seu genero:");
        genero = sc.nextLine();
        System.out.println("\nDigite o seu nome:");
        nome = sc.nextLine();
        System.out.println("\nDigite o seu cpf:");
        cpf = sc.nextInt();
        classe1 = new C1(genero, nome, cpf);

        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("\nEsses foram os dados preenchidos ate o momento:\n");
        classe1.mostrarAtributos();
        System.out.println("\n----------------------------------------------------------\n");

        C2 classe2 = new C2();
        System.out.println("\nDigite a sua idade:");
        idade = sc.nextInt();
        System.out.println("\nDigite a sua ocupacao:");
        clearBuffer(sc);
        ocupacao = sc.nextLine();
        System.out.println("\nDigite o seu patrimonio:");
        patrimonio = sc.nextDouble();
        classe2 = new C2(genero, nome, cpf, idade, ocupacao, patrimonio);
        
        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("\nEsses foram os dados preenchidos ate o momento:\n");
        classe2.mostrarAtributosSuper();
        System.out.println("\n----------------------------------------------------------\n");

        C3 classe3 = new C3();
        System.out.println("\nDigite o seu usuario:");
        clearBuffer(sc);
        usuario = sc.nextLine();
        System.out.println("\nDigite o seu email:");
        email = sc.nextLine();
        System.out.println("\nDigite o seu endereco:");
        endereco = sc.nextLine();
        classe3 = new C3(genero, nome, cpf, idade, ocupacao, patrimonio, usuario, email, endereco);
        
        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("\n\t***DADOS PREENCHIDOS***\n");
        classe3.mostrarAtributosSuper();
        System.out.println("\n----------------------------------------------------------\n");

        sc.close();

    }

    // método p/ resolução de problemas na leitura de dados
    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine())
            sc.nextLine();
    }
}
