public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.agencia = 146;
        primeiraConta.saldo+= 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("Primeira conta : " + primeiraConta.saldo);
        System.out.println("Segunda conta: " + segundaConta.saldo);

        System.out.println("Agencia da primeira conta: " + primeiraConta.agencia);
        System.out.println(segundaConta.numero);

        segundaConta.agencia = 146;
        System.out.println("Agora agência é : " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
