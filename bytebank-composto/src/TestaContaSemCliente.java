public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMaria = new Conta();
        System.out.println(contaDaMaria.getSaldo());

        contaDaMaria.titular = new Cliente();
        contaDaMaria.titular.nome = "Maria";
        System.out.println(contaDaMaria.titular.nome);
    }
}
