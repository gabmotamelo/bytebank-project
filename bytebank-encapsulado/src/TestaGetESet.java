public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1223,56456);

        // conta.numero = 1337;
        // não compila pois o atributo é privado.
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente gabriel = new Cliente();
        //gabriel.titular = "Gabriel";
        // não compila pois o atributo é privado.

        gabriel.setNome("Gabriel Mota");
        gabriel.setCpf("333.333.333-33");
        gabriel.setProfissao("Programador");
        conta.setTitular(gabriel);

        conta.getTitular().setProfissao("Desenvolvedor");

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());

        //Escrevendo em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Desenvolvedor");
        System.out.println(titularDaConta.getProfissao());


        //Os três irá se referir a mesma pessoa
        System.out.println(titularDaConta);
        System.out.println(gabriel);
        System.out.println(conta.getTitular());
    }
}
