public class Main {

    public static void main (String[] args) {

        String time = "Argentina";
        String tecnico = "Lionel Scaloni";

        Selecao selecao = new Selecao(time, tecnico);
        selecao.setSelecao(time);
        selecao.setTecnico(tecnico);

        System.out.println(selecao);

    }
}
