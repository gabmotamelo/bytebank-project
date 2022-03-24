public class TesteSistema {
    public static void main(String[] args) {
        Gerente geren = new Gerente();
        geren.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente clien =  new Cliente();
        clien.setSenha(2222);

        Fiscal fiscal = new Fiscal();
        fiscal.setSenha(2222);

        SistemaInterno sistInterno = new SistemaInterno();
        sistInterno.autentica(geren);
        sistInterno.autentica(adm);
        sistInterno.autentica(clien);
        sistInterno.autentica(fiscal);
    }
}
