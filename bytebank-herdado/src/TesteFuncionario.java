public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente joao = new Gerente();
        joao.setNome("João Mota");
        joao.setCpf("222.222.222-22");
        joao.setSalario(2600.00);

        System.out.println(joao.getNome());
        System.out.println(joao.getBonificacao());

        //joao.salario= 300.0;

    }
}
