import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);
        Normal ingressoNormal = new Normal(20.00);
        CamaroteInferior ingressoCamaroteInf = new CamaroteInferior(20.00, 15.00, "Fila H, Poltrona 42");
        CamaroteSuperior ingressoCamaroteSup = new CamaroteSuperior(20.00, 15.00, "Fila S, Poltrona 10", 20.00);

        System.out.println("------------------------------------------------");
        System.out.println("\nOLA! ESSAS SAO OPCOES DE INGRESSO:\n");
        System.out.println("1. NORMAL");
        ingressoNormal.escreveValor();
        System.out.println("2. VIP - CAMAROTE INFERIOR");
        ingressoCamaroteInf.escreveValor();
        System.out.println("3. VIP - CAMAROTE SUPERIOR");
        ingressoCamaroteSup.escreveValor();
        System.out.println("------------------------------------------------");

        System.out.println("\nQual ingresso deseja comprar? Digite o numero correspondente");
        int ingressoComprado = sc.nextInt();
        
        switch(ingressoComprado) {
            case 1: System.out.println("\nParabens, ingresso NORMAL comprado!");
            break;
            case 2: System.out.println("\nParabens! Ingresso CAMAROTE INFERIOR comprado!");
            System.out.printf("LOCALIZACAO: ");
            ingressoCamaroteInf.imprimeLocalizacao();
            break;
            case 3: System.out.println("\nParabens! Ingresso CAMAROTE SUPERIOR comprado!");
            System.out.printf("LOCALIZACAO: ");
            ingressoCamaroteSup.imprimeLocalizacao();
            break;
            default:
            System.out.println("Por favor, escolha uma opcao válida entre 1 e 3!");
        }

        sc.close();
    }
}
