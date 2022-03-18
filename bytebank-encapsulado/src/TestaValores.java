public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta( 1223, 56456);

        Conta conta2 = new Conta( 1223, 16343);

        Conta conta3 = new Conta(1223, 23454);

        System.out.println("Total de contas : " + Conta.getTotal());


    }
}
