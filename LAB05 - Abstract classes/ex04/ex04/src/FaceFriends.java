import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Contato[] contatos = new Contato[6];
        int contadorContatos = 0;
        
        while (true) {
            System.out.printf("\n-------------------------------------");
            System.out.printf("\n\tFACE FRIENDS\n");
            System.out.println("-------------------------------------\n");
            System.out.println("1. Familiares\n2. Amigos\n3. Trabalho\n4. Filtrar Contatos");
            System.out.println("5. Adicionar Contato\n6. Mostrar Contato\n7. Todos os Contatos\n8. Sair");
            System.out.println("");
            System.out.println("-------------------------------------\n");

            System.out.println("O que deseja fazer?");
            int op = sc.nextInt();

            switch (op) {

                case 1:
                    for (Contato i : contatos) {
                        if (i instanceof Familia)
                            ((Familia) i).imprimirContato();
                    }
                    break;

                case 2:
                    for (Contato i : contatos) {
                        if (i instanceof Amigos)
                            ((Amigos) i).imprimirContato();
                    }
                    break;

                case 3:
                    for (Contato i : contatos) {
                        if (i instanceof Trabalho)
                            ((Trabalho) i).imprimirContato();
                    }
                    break;

                case 4:
                    for (Contato i : contatos) {

                        if (i instanceof Amigos && ((Amigos) i).getGrauAmizade() == 1) {
                            System.out.println("\nMELHORES AMIGOS:");
                            ((Amigos) i).imprimirContato();
                            System.out.println();
                        }
                        if (i instanceof Familia && ((Familia) i).getParentesco() == "Irmao") {
                            System.out.println("IRMAOS:");
                            ((Familia) i).imprimirContato();
                            System.out.println();
                        }

                        if (i instanceof Trabalho && ((Trabalho) i).getTipo() == "Colega") {
                            System.out.println("COLEGAS DE TRABALHO:");
                            ((Trabalho) i).imprimirContato();
                            System.out.println();
                        }

                    }
                    break;

                case 5:
                    System.out.println("Qual sera a categoria do contato? Digite o numero da opcao desejada");
                    System.out.println("\n\t1. Familia\t2. Amigos\t3. Trabalho");
                    int categoriaContato = sc.nextInt();
                    int amizade;
                    String nome, apelido, email, aniversario, parentesco, tipo;
                    Contato novoContato;

                    if (categoriaContato == 1) {
                        System.out.println("\nVoce esta adicionando um FAMILIAR");
                        System.out.println("\nDigite o nome do contato:");
                        clearBuffer(sc);
                        nome = sc.nextLine();
                        System.out.println("Digite o apelido do contato:");
                        apelido = sc.nextLine();
                        System.out.println("Digite o email do contato:");
                        email = sc.next();
                        System.out.println("Digite o aniversario do contato:");
                        aniversario = sc.next();
                        System.out.println("Digite seu parentesco com o contato:");
                        parentesco = sc.next();
                        novoContato = new Familia(nome, apelido, email, aniversario, parentesco);
                        novoContato.imprimirContato();
                        contatos[contadorContatos] = novoContato; // armazenando contato no vetor
                        contadorContatos++;
                        System.out.println("\nContato Adicionado com Sucesso!");

                    }

                    if (categoriaContato == 2) {
                        System.out.println("\nVoce esta adicionando um AMIGO");
                        System.out.println("\nDigite o nome do contato:");
                        clearBuffer(sc);
                        nome = sc.nextLine();
                        System.out.println("Digite o apelido do contato:");
                        apelido = sc.nextLine();
                        System.out.println("Digite o email do contato:");
                        email = sc.nextLine();
                        System.out.println("Digite o aniversario do contato:");
                        aniversario = sc.nextLine();
                        System.out.println("Digite o numero correspondente ao grau de amizade com o contato (1 = melhor amigo, 2 = amigo, 3 = conhecido):");
                        amizade = sc.nextInt();
                        novoContato = new Amigos(nome, apelido, email, aniversario, amizade);
                        novoContato.imprimirContato();
                        contatos[contadorContatos] = novoContato; // armazenando contato no vetor
                        contadorContatos++;
                        System.out.println("\nContato Adicionado com Sucesso!");
                    }

                    if (categoriaContato == 3) {
                        System.out.println("\nVoce esta adicionando um COMPANHEIRO DE TRABALHO");
                        System.out.println("\nDigite o nome do contato:");
                        clearBuffer(sc);
                        nome = sc.nextLine();
                        System.out.println("Digite o apelido do contato:");
                        apelido = sc.nextLine();
                        System.out.println("Digite o email do contato:");
                        email = sc.nextLine();
                        System.out.println("Digite o aniversario do contato:");
                        aniversario = sc.nextLine();
                        System.out.println("Digite o tipo de relacionamento com o contato (Chefe, colega, superior, etc):");
                        tipo = sc.nextLine();
                        novoContato = new Trabalho(nome, apelido, email, aniversario, tipo);
                        novoContato.imprimirContato();
                        contatos[contadorContatos] = novoContato; // armazenando contato no vetor
                        contadorContatos++;
                        System.out.println("\nContato Adicionado com Sucesso!");
                    }
                    break;

                case 6:
                    System.out.println("\nDigite o numero da posicao do contato que deseja acessar");
                    int contatoEscolhido = sc.nextInt();
                    contatos[contatoEscolhido].imprimirContato();
                    break;

                case 7:
                    for (Contato i : contatos) {
                        if (i != null)
                            i.imprimirContato();
                    }
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("\n***OPCAO INVALIDA***\nTente novamente, digitando um valor valido");
                    op = sc.nextInt();
                    break;
            }

        }
    }

    // método p/ resolução de problemas na leitura de dados
    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine())
            sc.nextLine();

    }
}
