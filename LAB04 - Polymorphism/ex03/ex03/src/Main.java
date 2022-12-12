public class Main {
        public static void main(String[] args) {

                Estudante[] estudantes = new Estudante[100]; // A universidade tem no maximo 100 alunos
                Universidade instituicao = new Universidade ("UFU", "14 de agosto de 1969", estudantes);

                estudantes[0] = new EstudanteGraduacao("Graduando", "Santa Monica, Uberlandia", "TCC");
                estudantes[1] = new EstudanteMestrado("Mestrando", "Tibery, Uberlandia", "Medicina", "Linha X", "Tipo", "Titulo");
                estudantes[2] = new EstudanteDoutorado("Doutorando", "Saraiva, Uberlandia", "Ciencia da Computacao", "Redes de Computadores", "Titulo da Tese");

                System.out.println("-----------------------------------------");
                System.out.println("\nINFORMACOES DE TODOS ALUNOS\n");
                instituicao.showInfo(estudantes);
                System.out.println("-----------------------------------------");
                System.out.println("\nQUANTIDADE DE ALUNOS\n");
                instituicao.registerCounter(estudantes);
                System.out.println("-----------------------------------------");

                Estudante[] graduados = new Estudante[100];
                for (int i=0; i<100; i++) {

                        if (estudantes[i] != null) {
                                if (estudantes[i] instanceof EstudantePosGrad) {
                                        graduados[i] = estudantes[i];
                                }
                        }
                }

                System.out.println("\nINFORMACOES DE ALUNOS GRADUADOS\n");
                for (Estudante i : graduados) {
                        if (i != null)
                                ((EstudantePosGrad)i).print();
                }

        }
}
