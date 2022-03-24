public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Gerente();

        Gerente geren1 = new Gerente();
        geren1.setNome("Marcelo Silva");
        geren1.setCpf("333.333.333-33");
        geren1.setSalario(5000.00);


        System.out.println(geren1.getNome());
        System.out.println(geren1.getCpf());
        System.out.println(geren1.getSalario());

        geren1.setSenha(2222);
        boolean autenticou = geren1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(geren1.getBonificacao());
    }
}
