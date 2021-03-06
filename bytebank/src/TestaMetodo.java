public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoGabriel = new Conta();
        contaDoGabriel.saldo = 100;
        contaDoGabriel.deposita(50);
        System.out.println(contaDoGabriel.saldo);

        boolean conseguiuRetirar = contaDoGabriel.saca(20);
        System.out.println(contaDoGabriel.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMaria = new Conta();
        contaDaMaria.deposita(1000);

        boolean sucessoTransferencia = contaDaMaria.transfere(3000, contaDoGabriel);
        if (sucessoTransferencia) {
            System.out.println("TransferĂȘncia com sucesso!");
        } else {
            System.out.println("TransferĂȘncia falhou!");
        }

        System.out.println("Saldo da Maria: " + contaDaMaria.saldo);
        System.out.println("Saldo do Gabriel: " + contaDoGabriel.saldo);

        contaDoGabriel.titular = "Gabriel Mota";
        System.out.println(contaDoGabriel.titular);

    }
}
