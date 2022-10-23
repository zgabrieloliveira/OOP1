import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class principal {

    public static void ex01() { 

        Scanner sc = new Scanner(System.in);
        int val1, val2, val3, val4, val5, val6;

        System.out.println("<< Listando um vetor >>");

        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2: ");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3: ");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4: ");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5: ");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6: ");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

        sc.close();

    }

    public static void ex02() {

        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];

        System.out.println("<< Listando um vetor >>");
        for (int i=0; i<6; i++) {
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
        }

        System.out.printf("\nOs valores lidos são: ");
        for (int i=0; i<6; i++) {
            System.out.printf("%d ",vet[i]);
        }

        sc.close();
    }

    public static void ex03() {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];

        System.out.println("<< Listando um vetor na ordem inversa >>");
        for (int i=0; i<6; i++) {

            System.out.printf("Entre com um valor %d: ", i+1);
            v[i] = sc.nextInt();
        }

        System.out.printf("\nOs valores lidos são: ");
        for (int i=5; i>=0; i--) {
            System.out.printf("%d ", v[i]);
        }

        sc.close();

    }

    public static void ex04() {

        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];

        System.out.println("<< Listando os valores pares >>");
        for (int i=0; i<6; i++) {

            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();

            if (vet[i]%2 != 0) {
                System.out.println("Valor inválido");
                i--;
            }
        }

        System.out.printf("\nOs valores pares digitados foram: ");
        for (int i=0; i<6; i++) {
            System.out.printf("%d ",vet[i]);
        }

        sc.close();

    }

    public static void ex05() {

        Scanner sc = new Scanner(System.in);
        float[] v = new float[5];

        System.out.println("<< 5 valores >>");
        for (int i=0; i<5; i++) {

            System.out.printf("Entre com o número %d: ", i+1);
            v[i] = sc.nextFloat();

        }

        float maior = v[0], menor = v[0], media=0;

        System.out.printf("\nOs números digitados são: ");
        for (int i=0; i<5; i++) {
            System.out.printf("%.0f ",v[i]);

            if (v[i] < menor) {
                menor = v[i];
            }

            if (v[i] > maior) {
                maior = v[i];
            }

            media += v[i]/5;
        }

        System.out.printf("\nO maior valor é: %.0f", maior);
        System.out.printf("\nA menor é: %.0f", menor);
        System.out.printf("\nA média é: %.1f", media);

        sc.close();

    }

    public static void ex06() {

        Scanner sc = new Scanner(System.in);
        float[] v = new float[5];

        System.out.println("<< 5 valores >>");
        for (int i=0; i<5; i++) {

            System.out.printf("Entre com o número %d: ", i+1);
            v[i] = sc.nextFloat();

        }

        float maior = v[0], menor = v[0], media=0;
        int posicaoMaior=0, posicaoMenor=0;

        System.out.printf("\nOs números digitados são: ");
        for (int i=0; i<5; i++) {
            System.out.printf("%.0f ",v[i]);

            if (v[i] < menor) {
                menor = v[i];
                posicaoMenor = i;
            }

            if (v[i] > maior) {
                maior = v[i];
                posicaoMaior = i;
            }

            media += v[i]/5;
        }

        System.out.printf("\nO maior valor é: %.0f, localizado na posição %d do vetor", maior, posicaoMaior);
        System.out.printf("\nA menor é: %.0f, localizado na posição %d vetor", menor, posicaoMenor);
        System.out.printf("\nA média é: %.1f", media);

        sc.close();

    }

    public static void ex07() {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int maior = v[0];

        System.out.println("<< Normalizando notas >>");
        for (int i=0; i<5; i++) {

            System.out.printf("Entre com o número %d: ", i+1);
            v[i] = sc.nextInt();

        }


        for (int i=0; i<5; i++) {

            if (v[i] > maior) {
                maior = v[i];
            }
        }

        float posicao = 100/maior;

        System.out.println("\nNotas normalizadas\n");
        for (int i=0; i<5; i++) {
            System.out.printf("A nota do aluno %d é: %.0f\n", i+1, v[i]*posicao);
        }

        sc.close();

    }

    public static void ex08() {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        double somatorio=0, media=0, desvioPadrao=0;

        System.out.println("<< Média e desvio-padrão >>");
        for (int i=0; i<5; i++) {

            System.out.printf("Digite o valor %d: ", i+1);
            v[i] = sc.nextInt();

        }
        
        for (int i=0; i<5; i++) {

            media += v[i]/5;
            somatorio += Math.pow((v[i] - media), 2);
            desvioPadrao = Math.sqrt(somatorio/4);

        }

        System.out.printf("A média é %.0f e o desvio-padrão é %f\n", media, desvioPadrao);

        sc.close();

    }

    public static void ex09() {

        Scanner sc = new Scanner(System.in);
        int alunos=0;
        float[] notas = new float[100];
        float media=0;

        System.out.println("<< Média de n alunos. Máximo de 100 alunos >>");

        System.out.printf("Entre com o número de alunos: ");
        alunos = sc.nextInt();

        if (alunos>100) {
            System.out.println("Erro! O número máximo de alunos permitido é 100.");
        }

        else {

            for (int i=0; i<alunos; i++) {

                System.out.printf("Entre com a nota do aluno %d: ", i+1);
                notas[i] = sc.nextFloat();

                media += notas[i];
            }

            media/=alunos;

            System.out.println("\nRelatório de notas");
            for (int i=0; i<alunos; i++) {

                System.out.printf("A nota do aluno %d é: %.0f\n", i, notas[i]);
            }

            System.out.printf("A média da turma é: %.1f\n", media);

            sc.close();
        }
    }

    public static void ex10() {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[3], b = new int[3], c = new int[3];

        System.out.println("<< Subtração de vetores >>");
        
        for (int i=0; i<3; i++) {

            System.out.printf("Digite o valor %d de A: ", i+1);
            a[i] = sc.nextInt();

        }

        System.out.println();

        for (int i=0; i<3; i++) {

            System.out.printf("Digite o valor %d de B: ", i+1);
            b[i] = sc.nextInt();

        }

        for (int i=0; i<3; i++) {

            c[i] = a[i] - b[i];
        }

        System.out.printf("O vetor C, definido como C=A-B é (%d, %d, %d)", c[0], c[1], c[2]);

        sc.close();

    }

    public static void ex11() {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[5], v1 = new int[5], v2 = new int[5];

        System.out.println("<< Pares e Ímpares >>");

        for (int i=0; i<5; i++) {

            System.out.printf("Digite o valor %d: ", i+1);
            v[i] = sc.nextInt();

        }

        for (int i=0; i<5; i++) {

            if (v[i]%2 != 0)
                v1[i] = v[i];
            else 
                v2[i] = v[i];

        }

        System.out.println();

        System.out.printf("Ímpares: ");
        for (int i=0; i<5; i++) {

            if (v1[i] != 0)
                System.out.printf("%d ", v1[i]);
        
        }

        System.out.println();

        System.out.printf("Pares: ");
        for (int i=0; i<5; i++) {

            if (v2[i] != 0)
                System.out.printf("%d ", v2[i]);

        }

        sc.close();

    }

    public static void ex12() {

        Scanner sc = new Scanner(System.in);
        float verdes, azuis, amarelas, vermelhas, soma=0;
        float[] bolas = new float[4];

        System.out.println("<< Probabilidades >>");
        System.out.println("Digite a quantidade de bolinhas\n");

        System.out.printf("Verde: ");
        verdes = sc.nextFloat();

        System.out.printf("Azul: ");
        azuis = sc.nextFloat();

        System.out.printf("Amarelo: ");
        amarelas = sc.nextFloat();

        System.out.printf("Vermelho: ");
        vermelhas = sc.nextFloat();

        soma = verdes+azuis+amarelas+vermelhas;

        verdes = verdes/soma;
        azuis = azuis/soma;
        amarelas = amarelas/soma;
        vermelhas = vermelhas/soma;

        bolas[0] = verdes;
        bolas[1] = azuis;
        bolas[2] = amarelas;
        bolas[3] = vermelhas;
        Arrays.sort(bolas);
        
        System.out.println("\nProbabilidades");

        if (bolas[3] == verdes)
            System.out.printf("Verde: %.1f%% << Maior probabilidade\n", verdes*100);
        else 
            System.out.printf("Verde: %.1f%%\n", verdes*100);
        if (bolas[3] == azuis)
            System.out.printf("Azul: %.1f%% << Maior probabilidade\n", azuis*100);
        else 
            System.out.printf("Azul: %.1f%%\n", azuis*100);
        if (bolas[3] == amarelas)
            System.out.printf("Amarela: %.1f%% << Maior probabilidade\n", amarelas*100);
        else 
            System.out.printf("Amarela: %.1f%%\n", azuis*100);
        if (bolas[3] == vermelhas)
            System.out.printf("Vermelha: %.1f%% << Maior probabilidade\n", vermelhas*100);
        else 
            System.out.printf("Vermelha: %.1f%%\n", vermelhas*100);

        sc.close();

    }

    public static void ex13() {

        Scanner sc = new Scanner(System.in);
        int[] v = new int [5];

        System.out.println("<< Zerando negativos >>");

        for (int i=0; i<5; i++) {
            System.out.printf("Entre com o número %d: ", i+1);
            v[i] = sc.nextInt();
            
            if (v[i] < 0)
                v[i] = 0;
        }

        System.out.printf("Zerando os negativos, obtém-se: %d %d %d %d %d", v[0], v[1], v[2], v[3], v[4]);
        sc.close();
        
    }

    public static void ex14() {

        Scanner sc = new Scanner(System.in);
        int qntAlunos=0;

        System.out.println("<< Universidade X >>");
        System.out.println("Digite quantos alunos serão cadastrados: ");
        qntAlunos = sc.nextInt();

        int[] matriculaAluno = new int[qntAlunos];
        float[] cra = new float[qntAlunos];
        char[] classeSocial = new char[qntAlunos];

        if (qntAlunos > 10000) {
            System.out.println("\nErro! Não é possível cadastrar mais de 10000 alunos no sistema");
        }

        else {

            for (int i=0; i<qntAlunos; i++) {

                System.out.println("Entre com o número do aluno: ");
                matriculaAluno[i] = sc.nextInt();

                System.out.println("Entre com a classe social do aluno: ");
                classeSocial[i] = sc.next().charAt(0);

                System.out.println("Entre com o CRA do aluno: ");
                cra[i] = sc.nextFloat();

            }

            System.out.println("==== Alunos Cadastrados ====");
            for (int i=0; i<qntAlunos; i++) {
                System.out.printf("Número: %d Classe Social: %c CRA: %.1f\n", matriculaAluno[i], classeSocial[i], cra[i]);
            }

        }

        sc.close();

    }

    public static void ex15() {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        int[] repetidos = new int[8];

        System.out.println("<< Valores iguais >>");

        for (int i=0; i<8; i++) {

            System.out.printf("Entre com o número %d: ", i+1);
            v[i] = sc.nextInt();

        }

        sc.close();
        Arrays.sort(v);
        int indicePreenchido=0;

            for (int i=0; i<8; i++) {
                
                if (i<7 && v[i]==v[i+1])
                {
                    repetidos[i] = v[i];
                    indicePreenchido++;
                }

                else if (i==7 && v[i]==v[i-1]) {
                    repetidos[i] = v[i];
                    indicePreenchido++;
                }         
            }

        System.out.printf("Valores repetidos: ");

        for (int i=0; i<8; i++) {

            if (indicePreenchido>0 && repetidos[i]!=0 && i<7 && repetidos[i]!=repetidos[i+1])
                System.out.printf("%d ", repetidos[i]);

            else if (indicePreenchido>0 && repetidos[i]!=0 && i==7 && repetidos[i]!=repetidos[i-1])
                System.out.printf("%d ", repetidos[i]);
        }  


    }

    public static void main(String[] args) {

        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        // ex15();
        // ex16();

    }

 
}
