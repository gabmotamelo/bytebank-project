public class CalculadorImposto {

    private double valorTotalImposto;

    public void registra(Tributavel elementoTributar){
        double valorTributado = elementoTributar.getValorImposto();
        this.valorTotalImposto += valorTributado;
    }

    public double getValorTotalImposto() {
        return valorTotalImposto;
    }
}

