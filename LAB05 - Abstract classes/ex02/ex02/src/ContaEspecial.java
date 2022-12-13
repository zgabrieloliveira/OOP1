public class ContaEspecial extends ContaCorrente {
    
    private float limiteCredito;

    public ContaEspecial() {
    }

    public ContaEspecial(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public ContaEspecial(float val, int num, int pwd, float limiteCredito) {
        super(val, num, pwd);
        this.limiteCredito = limiteCredito;
    }

    public void contaSempreAtiva(ContaCorrente conta, int senha) {

        if (conta instanceof ContaEspecial) {
            // em conta especial, se limite maior que 0 e saldo zerar, conta nao fica inativa
            if (((ContaEspecial)conta).getLimiteCredito() > 0 && conta.getSaldo(senha) == 0)
                conta.setEstado(senha, 1);
        }

    }

    public float getLimiteCredito() {
        return limiteCredito;
    }
 
}
