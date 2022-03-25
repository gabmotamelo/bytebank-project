public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida segVid = new SeguroDeVida();

        CalculadorImposto calcImpost = new CalculadorImposto();
        calcImpost.registra(cc);
        calcImpost.registra(segVid);

        System.out.println("Valor total de imposto será: " + calcImpost.getValorTotalImposto());


    }
}
