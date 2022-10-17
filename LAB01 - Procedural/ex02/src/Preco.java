public class Preco {
   
    public static double Altera_preco(double preco, double porcentagem){
        
        double temp;

        if(porcentagem > -100){
            temp = 1 + porcentagem/100;
            preco = (preco)*temp;
            
            return preco;
            
        }else{

            return 0;
        }
    }
}
