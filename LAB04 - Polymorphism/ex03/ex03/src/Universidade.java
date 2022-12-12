public class Universidade {

    protected String nomeInstituição;
    protected String dataFundacao;
    Estudante[] estudantes;

    public Universidade() {
    }

    public Universidade(String nomeInstituição, String dataFundacao, Estudante[] estudantes) {
        this.nomeInstituição = nomeInstituição;
        this.dataFundacao = dataFundacao;
        this.estudantes = estudantes;
    }

    public void registerCounter(Estudante[] estudantes) {
        
        int contDoutorandos=0, contMestrandos=0, contGraduandos=0;

        for (Estudante i : estudantes) {

            if (i instanceof EstudanteGraduacao)
                contGraduandos++;
            if (i instanceof EstudanteMestrado)
                contMestrandos++;
            if (i instanceof EstudanteDoutorado)
                contDoutorandos++;
        }

        System.out.println("\nTotal de GRADUANDOS Matriculados: " + contGraduandos);
        System.out.println("Total de MESTRANDOS Matriculados: " + contMestrandos);
        System.out.println("Total de DOUTORANDOS Matriculados: " + contDoutorandos + "\n");

    }

    public void showInfo(Estudante[] estudantes) {

        for (Estudante i : estudantes) {
        
            if (i != null) {
                System.out.println("NOME: " + i.getNome());
                if (i instanceof EstudanteDoutorado) {
                    System.out.println("LINHA DE PESQUISA: " + ((EstudantePosGrad)i).getLinhadDePesquisa());
                    System.out.println("TITULO DE TESE: " + ((EstudanteDoutorado)i).getTituloTese());
                }
                System.out.println();

            }
            
        }

    }

    public String getNomeInstituição() {
        return nomeInstituição;
    }

    public void setNomeInstituição(String nomeInstituição) {
        this.nomeInstituição = nomeInstituição;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

}
