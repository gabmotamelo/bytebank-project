public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel funcAutent){
        boolean autenticou = funcAutent.autentica(this.senha);
        if (autenticou) {
            System.out.println("Acesso com sucesso!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
