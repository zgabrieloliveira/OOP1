public class Main {

    public static void main (String[] args) {

        Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("Helena");
        clientes[1] = new Cliente("Emanuel"); 
        clientes[2] = new Cliente("Gael");

        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto(123456);
        produtos[1] = new Produto(321321); 
        produtos[2] = new Produto(123123);

        Servico[] servicos = new Servico[3];
        servicos[0] = new Servico(350.00);
        servicos[1] = new Servico(280.00);
        servicos[2] = new Servico(150.00);

        // ordenando elementos
        Classificador.ordena(clientes);
        Classificador.ordena(produtos);
        Classificador.ordena(servicos);


        // imprimindo vetores
        System.out.println("CLIENTES:\n");
        for (Cliente i : clientes) {
            System.out.println(i);
        }

        System.out.println("\nPRODUTOS:\n");
        for (Produto i : produtos) {
            System.out.println(i);
        }
        
        System.out.println("\nSERVICOS:\n");
        for (Servico i : servicos) {
            System.out.println(i);
        }
    } 
}
