public class ContaComum extends ContaCorrente {

    private float limiteCredito;

    public ContaComum() {
    }

    public ContaComum(float val, int num, int pwd, float limiteCredito) {
        super(val, num, pwd);
        this.limiteCredito = 0;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

}
