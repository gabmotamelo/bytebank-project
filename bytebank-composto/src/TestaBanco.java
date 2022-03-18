public class TestaBanco {
    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        gabriel.nome = "Gabriel Mota";
        gabriel.cpf = "223.222.222-44";
        gabriel.profissao = "programador";

        // associa o cliente gabriel a contaDoGabriel
        Conta contaDoGabriel = new Conta();
        contaDoGabriel.deposita(100);
        contaDoGabriel.titular = gabriel;
        System.out.println(contaDoGabriel.titular.nome);
    }
}
