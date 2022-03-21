public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario func) {
        double bonificacao = func.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }


}
