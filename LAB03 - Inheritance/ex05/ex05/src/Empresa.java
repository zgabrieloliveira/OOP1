import java.util.Locale;

public class Empresa {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Chefe[] chefes = new Chefe[3];
        Vendedor[] vendedores = new Vendedor[6];
        Operario[] operarios = new Operario[12];
        Horista[] horistas = new Horista[9];

        System.out.println("\n-------------------------------------------\n");

        System.out.println("\n***CHEFES***\n");
        for(int i=0; i<3; i++){
            chefes[i] = new Chefe("Chefe", "11/11/1991", 12000.00);
            System.out.println(chefes[i]);
        }

        System.out.println("\n-------------------------------------------\n");

        System.out.println("\n***VENDEDORES***\n");
        for(int i=0; i<6; i++){
            vendedores[i] = new Vendedor("Vendedor", "12/12/1992", 1500.00, 30.00, 75);
            System.out.println(vendedores[i]);
        }

        System.out.println("\n-------------------------------------------\n");

        System.out.println("\n***OPERARIOS***\n");
        for(int i=0; i<12; i++){
            operarios[i] = new Operario("Operario", "01/01/2001", 0.00, 20.00, 100);
            System.out.println(operarios[i]);
        }

        System.out.println("\n-------------------------------------------\n");

        System.out.println("\n***HORISTAS***\n");
        for(int i=0; i<9; i++){
            horistas[i] = new Horista("Horista", "01/02/2003", 0.00, 35.00, 66);
            System.out.println(horistas[i]);
        }

        System.out.println("\n-------------------------------------------\n");

    }
}
